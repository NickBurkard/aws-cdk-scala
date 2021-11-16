package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceVersionProps {

  def apply(
    schemaHandlerPackage: String,
    typeName: String,
    executionRoleArn: Option[String] = None,
    loggingConfig: Option[software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty] = None
  ): software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps =
    (new software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps.Builder)
      .schemaHandlerPackage(schemaHandlerPackage)
      .typeName(typeName)
      .executionRoleArn(executionRoleArn.orNull)
      .loggingConfig(loggingConfig.orNull)
      .build()
}
