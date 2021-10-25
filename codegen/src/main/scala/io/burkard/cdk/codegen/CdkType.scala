package io.burkard.cdk.codegen

final case class CdkType private(
  serviceName: String,
  finalPackageName: String,
  instanceCanonicalName: String,
  instanceSimpleName: String,
  underlying: Class[_]
) {
  lazy val packageName: String = renamePackage(underlying.getPackageName)

  lazy val typeAlias: String =
    s"type ${literallyIdentify(instanceCanonicalName, preservePackageName = false)} = $instanceCanonicalName\n"
}

object CdkType {
  def build(serviceName: String)(underlying: Class[_]): Option[CdkType] =
    if (isAllowed(underlying)) {
      renamePackage(underlying.getPackageName)
        .split('.')
        .lastOption
        .map(
          CdkType(
            serviceName,
            _,
            underlying.getCanonicalName.replaceAll("\\$", "."),
            underlying.getSimpleName,
            underlying
          )
        )
    } else {
      None
    }

  private[this] val disallowedNames: Set[String] =
    Set("Builder", "package-info")

  private[this] def isAllowed(underlying: Class[_]): Boolean =
    underlying.getPackageName.contains("software.amazon.awscdk") &&
      !underlying.getSimpleName.contains("Jsii") &&
      !underlying.getSimpleName.startsWith("$") &&
      !disallowedNames.contains(underlying.getSimpleName)
}