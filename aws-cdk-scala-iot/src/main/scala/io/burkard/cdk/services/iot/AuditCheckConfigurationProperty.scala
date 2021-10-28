package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuditCheckConfigurationProperty {

  def apply(
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty =
    (new software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
