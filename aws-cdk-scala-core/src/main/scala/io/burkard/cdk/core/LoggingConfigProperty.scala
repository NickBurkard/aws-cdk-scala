package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggingConfigProperty {

  def apply(
    logGroupName: Option[String] = None,
    logRoleArn: Option[String] = None
  ): software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty =
    (new software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty.Builder)
      .logGroupName(logGroupName.orNull)
      .logRoleArn(logRoleArn.orNull)
      .build()
}
