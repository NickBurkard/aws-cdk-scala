package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfigurationOptionSettingProperty {

  def apply(
    resourceName: Option[String] = None,
    namespace: Option[String] = None,
    optionName: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder)
      .resourceName(resourceName.orNull)
      .namespace(namespace.orNull)
      .optionName(optionName.orNull)
      .value(value.orNull)
      .build()
}
