package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggingConfigProperty {

  def apply(
    logGroupName: Option[String] = None,
    logRoleArn: Option[String] = None
  ): software.amazon.awscdk.CfnResourceVersion.LoggingConfigProperty =
    (new software.amazon.awscdk.CfnResourceVersion.LoggingConfigProperty.Builder)
      .logGroupName(logGroupName.orNull)
      .logRoleArn(logRoleArn.orNull)
      .build()
}
