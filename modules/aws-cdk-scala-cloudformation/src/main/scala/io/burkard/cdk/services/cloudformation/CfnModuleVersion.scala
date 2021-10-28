package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnModuleVersion {

  def apply(
    internalResourceId: String,
    moduleName: Option[String] = None,
    modulePackage: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudformation.CfnModuleVersion =
    software.amazon.awscdk.services.cloudformation.CfnModuleVersion.Builder
      .create(stackCtx, internalResourceId)
      .moduleName(moduleName.orNull)
      .modulePackage(modulePackage.orNull)
      .build()
}
