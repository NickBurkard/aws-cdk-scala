package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnModuleVersionProps {

  def apply(
    moduleName: Option[String] = None,
    modulePackage: Option[String] = None
  ): software.amazon.awscdk.CfnModuleVersionProps =
    (new software.amazon.awscdk.CfnModuleVersionProps.Builder)
      .moduleName(moduleName.orNull)
      .modulePackage(modulePackage.orNull)
      .build()
}
