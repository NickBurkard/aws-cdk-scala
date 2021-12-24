import java.lang.reflect.Modifier

import scala.util.matching.Regex

import sbt._

import com.google.common.base.CaseFormat

object codegen {
  def renameCdkPackage(name: String): String =
    name.replaceFirst("software\\.amazon\\.awscdk", "io.burkard.cdk")

  private[this] val scala2ReservedWords: Set[String] =
    Set(
      "abstract", "case", "catch", "class", "def", "do", "else", "extends", "false", "final", "finally", "for",
      "forSome", "if", "implicit", "import", "lazy", "match", "new", "null", "object", "override", "package",
      "private", "protected", "return", "sealed", "super", "then", "this", "throw", "trait", "try", "true", "type",
      "val", "var", "while", "with", "yield"
    )

  // Literally identify reserved words.
  def literallyIdentify(name: String): String =
    if (scala2ReservedWords.contains(name)) {
      s"`$name`"
    } else {
      name
    }

  // Rewrite rules for Java types in order of descending precedence.
  private[this] val javaRewrites: List[(Regex, String)] =
    List(
      raw"java\.lang\.Boolean".r -> "Boolean",
      raw"java\.lang\.Number".r -> "Number",
      raw"java\.lang\.Object".r -> "AnyRef",
      raw"java\.lang\.String".r -> "String",
      raw"java\.util\.Map".r -> "Map",
      raw"java\.util\.List".r -> "List",
      raw"<".r -> "[",
      raw">".r -> "]",
      raw"extends".r -> "<:",
      raw"\?".r -> "_"
    )

  // Rewrite any java types in a type name.
  def rewriteJavaTypes(typeName: String): String =
    javaRewrites.foldLeft(typeName) { case (value, (regex, replacement)) =>
      regex.replaceAllIn(value, replacement)
    }

  // Does a type require java converters?
  def requiresJavaConverters(typeName: String): Boolean =
    typeName.contains("List[") || typeName.contains("Map[")

  final implicit class ClassOps(private val c: Class[_]) extends AnyVal {
    def requiredFieldNames: Set[String] =
      c.getDeclaredMethods.toList
        .collect {
          case m if !Modifier.isStatic(m.getModifiers) && m.getName.startsWith("get") && !m.isDefault =>
            CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, m.getName.stripPrefix("get"))
        }
        .toSet
  }

  final implicit class SourceGeneratorOps[A: SourceGenerator](private val a: A) {
    def writeFile(root: File): File =
      SourceGenerator[A].writeFile(root, a)
  }

  final implicit class SbtFileOps(private val root: File) extends AnyVal {
    // Traverse down a path that has embedded slashes.
    def /~(path: String): File =
      path.split('/').foldLeft(root)(_ / _)
  }
}
