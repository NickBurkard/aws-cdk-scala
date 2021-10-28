package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnModuleVersionProps {

  def apply(
    moduleName: Option[String] = None,
    modulePackage: Option[String] = None
  ): software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps =
    (new software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps.Builder)
      .moduleName(moduleName.orNull)
      .modulePackage(modulePackage.orNull)
      .build()
}
