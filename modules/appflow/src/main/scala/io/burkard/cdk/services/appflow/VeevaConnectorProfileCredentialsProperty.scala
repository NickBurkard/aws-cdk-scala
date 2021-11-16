package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VeevaConnectorProfileCredentialsProperty {

  def apply(
    username: String,
    password: String
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty.Builder)
      .username(username)
      .password(password)
      .build()
}
