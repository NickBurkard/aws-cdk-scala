package io.burkard.cdk.alexa

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthenticationConfigurationProperty {

  def apply(
    clientId: String,
    clientSecret: String,
    refreshToken: String
  ): software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty =
    (new software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder)
      .clientId(clientId)
      .clientSecret(clientSecret)
      .refreshToken(refreshToken)
      .build()
}
