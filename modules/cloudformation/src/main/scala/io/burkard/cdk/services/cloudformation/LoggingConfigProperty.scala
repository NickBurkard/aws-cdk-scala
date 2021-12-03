package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggingConfigProperty {

  def apply(
    logGroupName: Option[String] = None,
    logRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty =
    (new software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty.Builder)
      .logGroupName(logGroupName.orNull)
      .logRoleArn(logRoleArn.orNull)
      .build()
}
