package io.burkard.cdk.services.applicationinsights

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlarmProperty {

  def apply(
    severity: Option[String] = None,
    alarmName: Option[String] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty.Builder)
      .severity(severity.orNull)
      .alarmName(alarmName.orNull)
      .build()
}
