package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OptionSettingProperty {

  def apply(
    namespace: String,
    optionName: String,
    resourceName: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder)
      .namespace(namespace)
      .optionName(optionName)
      .resourceName(resourceName.orNull)
      .value(value.orNull)
      .build()
}
