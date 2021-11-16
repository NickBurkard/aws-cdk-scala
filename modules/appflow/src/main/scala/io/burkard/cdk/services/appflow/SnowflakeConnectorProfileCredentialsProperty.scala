package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnowflakeConnectorProfileCredentialsProperty {

  def apply(
    username: String,
    password: String
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty.Builder)
      .username(username)
      .password(password)
      .build()
}
