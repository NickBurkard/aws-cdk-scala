package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceValueProperty {

  def apply(
    value: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty =
    (new software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty.Builder)
      .value(value.orNull)
      .build()
}
