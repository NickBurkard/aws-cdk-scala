package io.burkard.cdk

import scala.util.matching.Regex

package object codegen {
  // Service-based builders.
  // `.service` package is optional.
  val ServiceRegex: Regex = raw"^software\.amazon\.awscdk(\.services)?\.([a-z0-9]+).*".r

  // General builders, often shared between services.
  val CoreRegex: Regex = raw"^software\.amazon\.awscdk".r

  // Package rewrite rules in descending order of precedence.
  private[this] val packageRewrites: List[(Regex, Regex.Match => String)] =
    List(
      ServiceRegex -> { m =>
        if (m.group(1) == null) {
          s"io.burkard.cdk.${m.group(2)}"
        } else {
          s"io.burkard.cdk.services.${m.group(2)}"
        }
      },
      CoreRegex -> { _ => "io.burkard.cdk.core" }
    )

  // Potentially rename a package.
  def renamePackage(name: String): String =
    packageRewrites.foldLeft(name) { case (value, (regex, replacer)) =>
      regex.replaceAllIn(value, replacer)
    }

  private[this] val scala2ReservedWords: Set[String] =
    Set(
      "abstract", "case", "catch", "class", "def", "do", "else", "extends", "false", "final", "finally","for",
      "forSome", "if", "implicit", "import", "lazy", "match", "new", "null", "object", "override", "package",
      "private", "protected", "return", "sealed", "super", "this", "throw", "trait", "try", "true", "type",
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

  // Syntax for converting to source files.
  final implicit class SourceGeneratorOps[A](private val source: A) extends AnyVal {
    def sourceFile(implicit sourceGenerator: SourceGenerator[A]): SourceFile =
      sourceGenerator.sourceFile(source)
  }
}
