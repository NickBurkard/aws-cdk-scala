package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InforNexusConnectorProfileCredentialsProperty {

  def apply(
    secretAccessKey: Option[String] = None,
    datakey: Option[String] = None,
    accessKeyId: Option[String] = None,
    userId: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty.Builder)
      .secretAccessKey(secretAccessKey.orNull)
      .datakey(datakey.orNull)
      .accessKeyId(accessKeyId.orNull)
      .userId(userId.orNull)
      .build()
}
