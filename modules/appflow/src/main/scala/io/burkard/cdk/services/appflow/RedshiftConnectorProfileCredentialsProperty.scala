package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedshiftConnectorProfileCredentialsProperty {

  def apply(
    username: Option[String] = None,
    password: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty.Builder)
      .username(username.orNull)
      .password(password.orNull)
      .build()
}
