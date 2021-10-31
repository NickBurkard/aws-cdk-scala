package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModuleDefaultVersion {

  def apply(
    internalResourceId: String,
    arn: Option[String] = None,
    versionId: Option[String] = None,
    moduleName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnModuleDefaultVersion =
    software.amazon.awscdk.CfnModuleDefaultVersion.Builder
      .create(stackCtx, internalResourceId)
      .arn(arn.orNull)
      .versionId(versionId.orNull)
      .moduleName(moduleName.orNull)
      .build()
}
