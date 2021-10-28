package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceValueProperty {

  def apply(
    value: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty =
    (new software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty.Builder)
      .value(value.orNull)
      .build()
}
