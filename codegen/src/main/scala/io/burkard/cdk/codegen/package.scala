package io.burkard.cdk

import scala.util.matching.Regex

package object codegen {
  // Service-based builders.
  // `.service` package is optional.
  val ServiceRegex: Regex = raw"^software\.amazon\.awscdk(\.services)?\.([a-zA-Z0-9]+).*".r

  // General builders, often shared between services.
  val CoreRegex: Regex = raw"^software\.amazon\.awscdk".r

  // Potentially rename a package.
  def renamePackage(name: String): String =
    name match {
      // `.services` package is not present.
      case ServiceRegex(null, serviceName) =>
        s"io.burkard.cdk.$serviceName"

      // `.services` package is present.
      case ServiceRegex(_, serviceName) =>
        s"io.burkard.cdk.services.$serviceName"

      // A core AWS resource.
      case CoreRegex() =>
        "io.burkard.cdk.core"

      // No need to rename.
      case _ =>
        name
    }

  private[this] val scala2ReservedWords: Set[String] =
    Set(
      "abstract", "case", "catch", "class", "def", "do", "else", "extends", "false", "final", "finally","for",
      "forSome", "if", "implicit", "import", "lazy", "match", "new", "null", "object", "override", "package",
      "private", "protected", "return", "sealed", "super", "this", "throw", "trait", "try", "true", "type",
      "val", "var", "while", "with", "yield"
    )

  def renameType(name: String): String =
    if (scala2ReservedWords.contains(name)) {
      s"`$name`"
    } else {
      name
    }

  final implicit class SourceGeneratorOps[A](private val source: A) extends AnyVal {
    def sourceFile(implicit sourceGenerator: SourceGenerator[A]): SourceFile =
      sourceGenerator.sourceFile(source)
  }
}
