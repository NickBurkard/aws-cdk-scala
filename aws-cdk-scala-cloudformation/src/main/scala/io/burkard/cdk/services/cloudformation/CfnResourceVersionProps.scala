package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceVersionProps {

  def apply(
    schemaHandlerPackage: Option[String] = None,
    typeName: Option[String] = None,
    executionRoleArn: Option[String] = None,
    loggingConfig: Option[software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty] = None
  ): software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps =
    (new software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps.Builder)
      .schemaHandlerPackage(schemaHandlerPackage.orNull)
      .typeName(typeName.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .loggingConfig(loggingConfig.orNull)
      .build()
}
