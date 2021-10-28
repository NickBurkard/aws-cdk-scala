package io.burkard.cdk.services.appconfig

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MonitorsProperty {

  def apply(
    alarmRoleArn: Option[String] = None,
    alarmArn: Option[String] = None
  ): software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty =
    (new software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty.Builder)
      .alarmRoleArn(alarmRoleArn.orNull)
      .alarmArn(alarmArn.orNull)
      .build()
}
