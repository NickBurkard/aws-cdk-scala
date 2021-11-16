package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeConfigurationProperty {

  def apply(
    configurationSource: String,
    codeConfigurationValues: Option[software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty.Builder)
      .configurationSource(configurationSource)
      .codeConfigurationValues(codeConfigurationValues.orNull)
      .build()
}
