package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfigurationOptionSettingProperty {

  def apply(
    namespace: String,
    optionName: String,
    resourceName: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder)
      .namespace(namespace)
      .optionName(optionName)
      .resourceName(resourceName.orNull)
      .value(value.orNull)
      .build()
}
