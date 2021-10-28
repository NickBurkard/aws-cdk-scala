package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnModuleDefaultVersion {

  def apply(
    internalResourceId: String,
    arn: Option[String] = None,
    versionId: Option[String] = None,
    moduleName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion =
    software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion.Builder
      .create(stackCtx, internalResourceId)
      .arn(arn.orNull)
      .versionId(versionId.orNull)
      .moduleName(moduleName.orNull)
      .build()
}
