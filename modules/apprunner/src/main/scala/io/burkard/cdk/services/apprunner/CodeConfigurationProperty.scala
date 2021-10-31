package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeConfigurationProperty {

  def apply(
    codeConfigurationValues: Option[software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty] = None,
    configurationSource: Option[String] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty.Builder)
      .codeConfigurationValues(codeConfigurationValues.orNull)
      .configurationSource(configurationSource.orNull)
      .build()
}
