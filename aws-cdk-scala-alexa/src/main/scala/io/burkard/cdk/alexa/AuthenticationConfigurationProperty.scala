package io.burkard.cdk.alexa

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuthenticationConfigurationProperty {

  def apply(
    clientId: Option[String] = None,
    clientSecret: Option[String] = None,
    refreshToken: Option[String] = None
  ): software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty =
    (new software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder)
      .clientId(clientId.orNull)
      .clientSecret(clientSecret.orNull)
      .refreshToken(refreshToken.orNull)
      .build()
}
