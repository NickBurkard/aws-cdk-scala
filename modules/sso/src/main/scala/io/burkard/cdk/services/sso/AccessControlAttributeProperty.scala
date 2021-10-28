package io.burkard.cdk.services.sso

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessControlAttributeProperty {

  def apply(
    key: Option[String] = None,
    value: Option[software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty] = None
  ): software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty =
    (new software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
