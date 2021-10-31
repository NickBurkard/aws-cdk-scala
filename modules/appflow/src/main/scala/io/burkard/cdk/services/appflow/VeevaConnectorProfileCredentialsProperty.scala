package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VeevaConnectorProfileCredentialsProperty {

  def apply(
    username: Option[String] = None,
    password: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty.Builder)
      .username(username.orNull)
      .password(password.orNull)
      .build()
}
