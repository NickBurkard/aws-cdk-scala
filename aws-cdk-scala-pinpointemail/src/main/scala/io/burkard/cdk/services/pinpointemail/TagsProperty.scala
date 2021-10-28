package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagsProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TagsProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TagsProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
