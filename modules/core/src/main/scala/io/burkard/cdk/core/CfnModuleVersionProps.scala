package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModuleVersionProps {

  def apply(
    moduleName: String,
    modulePackage: String
  ): software.amazon.awscdk.CfnModuleVersionProps =
    (new software.amazon.awscdk.CfnModuleVersionProps.Builder)
      .moduleName(moduleName)
      .modulePackage(modulePackage)
      .build()
}
