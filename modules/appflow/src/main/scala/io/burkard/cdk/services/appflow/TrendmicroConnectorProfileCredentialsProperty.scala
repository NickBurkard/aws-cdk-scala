package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TrendmicroConnectorProfileCredentialsProperty {

  def apply(
    apiSecretKey: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty.Builder)
      .apiSecretKey(apiSecretKey.orNull)
      .build()
}
