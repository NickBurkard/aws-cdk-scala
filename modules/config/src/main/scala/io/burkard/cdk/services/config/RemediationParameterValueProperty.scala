package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RemediationParameterValueProperty {

  def apply(
    resourceValue: Option[software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty] = None,
    staticValue: Option[software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty] = None
  ): software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty =
    (new software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty.Builder)
      .resourceValue(resourceValue.orNull)
      .staticValue(staticValue.orNull)
      .build()
}
