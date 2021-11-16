package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceVersion {

  def apply(
    internalResourceId: String,
    schemaHandlerPackage: String,
    typeName: String,
    executionRoleArn: Option[String] = None,
    loggingConfig: Option[software.amazon.awscdk.CfnResourceVersion.LoggingConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnResourceVersion =
    software.amazon.awscdk.CfnResourceVersion.Builder
      .create(stackCtx, internalResourceId)
      .schemaHandlerPackage(schemaHandlerPackage)
      .typeName(typeName)
      .executionRoleArn(executionRoleArn.orNull)
      .loggingConfig(loggingConfig.orNull)
      .build()
}
