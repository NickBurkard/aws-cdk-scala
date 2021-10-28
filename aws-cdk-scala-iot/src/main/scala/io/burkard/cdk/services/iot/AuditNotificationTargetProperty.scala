package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuditNotificationTargetProperty {

  def apply(
    targetArn: Option[String] = None,
    enabled: Option[Boolean] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty =
    (new software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty.Builder)
      .targetArn(targetArn.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .roleArn(roleArn.orNull)
      .build()
}
