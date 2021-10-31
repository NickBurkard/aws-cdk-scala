package io.burkard.cdk.services.appconfig

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ValidatorsProperty {

  def apply(
    content: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty =
    (new software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty.Builder)
      .content(content.orNull)
      .`type`(`type`.orNull)
      .build()
}
