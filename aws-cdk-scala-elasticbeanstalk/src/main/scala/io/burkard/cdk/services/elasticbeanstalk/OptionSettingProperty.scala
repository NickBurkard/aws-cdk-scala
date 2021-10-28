package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OptionSettingProperty {

  def apply(
    resourceName: Option[String] = None,
    namespace: Option[String] = None,
    optionName: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder)
      .resourceName(resourceName.orNull)
      .namespace(namespace.orNull)
      .optionName(optionName.orNull)
      .value(value.orNull)
      .build()
}
