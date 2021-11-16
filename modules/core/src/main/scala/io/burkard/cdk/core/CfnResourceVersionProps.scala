package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceVersionProps {

  def apply(
    schemaHandlerPackage: String,
    typeName: String,
    executionRoleArn: Option[String] = None,
    loggingConfig: Option[software.amazon.awscdk.CfnResourceVersion.LoggingConfigProperty] = None
  ): software.amazon.awscdk.CfnResourceVersionProps =
    (new software.amazon.awscdk.CfnResourceVersionProps.Builder)
      .schemaHandlerPackage(schemaHandlerPackage)
      .typeName(typeName)
      .executionRoleArn(executionRoleArn.orNull)
      .loggingConfig(loggingConfig.orNull)
      .build()
}
