package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceVersion {

  def apply(
    internalResourceId: String,
    schemaHandlerPackage: Option[String] = None,
    typeName: Option[String] = None,
    executionRoleArn: Option[String] = None,
    loggingConfig: Option[software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudformation.CfnResourceVersion =
    software.amazon.awscdk.services.cloudformation.CfnResourceVersion.Builder
      .create(stackCtx, internalResourceId)
      .schemaHandlerPackage(schemaHandlerPackage.orNull)
      .typeName(typeName.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .loggingConfig(loggingConfig.orNull)
      .build()
}
