package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModuleVersionProps {

  def apply(
    moduleName: String,
    modulePackage: String
  ): software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps =
    (new software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps.Builder)
      .moduleName(moduleName)
      .modulePackage(modulePackage)
      .build()
}
