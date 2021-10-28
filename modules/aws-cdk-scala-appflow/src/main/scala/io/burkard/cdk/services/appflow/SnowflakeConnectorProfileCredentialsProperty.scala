package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SnowflakeConnectorProfileCredentialsProperty {

  def apply(
    username: Option[String] = None,
    password: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty.Builder)
      .username(username.orNull)
      .password(password.orNull)
      .build()
}
