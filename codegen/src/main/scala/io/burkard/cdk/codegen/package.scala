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
}
