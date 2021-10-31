package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlarmActionConfig {

  def apply(
    alarmActionArn: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.AlarmActionConfig =
    (new software.amazon.awscdk.services.cloudwatch.AlarmActionConfig.Builder)
      .alarmActionArn(alarmActionArn.orNull)
      .build()
}
