package io.burkard.cdk.services.sso

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessControlAttributeProperty {

  def apply(
    key: String,
    value: software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty
  ): software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty =
    (new software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
