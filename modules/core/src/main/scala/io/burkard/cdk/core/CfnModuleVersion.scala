package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModuleVersion {

  def apply(
    internalResourceId: String,
    moduleName: String,
    modulePackage: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnModuleVersion =
    software.amazon.awscdk.CfnModuleVersion.Builder
      .create(stackCtx, internalResourceId)
      .moduleName(moduleName)
      .modulePackage(modulePackage)
      .build()
}
