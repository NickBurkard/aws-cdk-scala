package io.burkard.cdk.services.appconfig

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagsProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.TagsProperty =
    (new software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.TagsProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
