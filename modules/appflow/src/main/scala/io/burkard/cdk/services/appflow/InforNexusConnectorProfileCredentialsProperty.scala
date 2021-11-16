package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InforNexusConnectorProfileCredentialsProperty {

  def apply(
    secretAccessKey: String,
    datakey: String,
    accessKeyId: String,
    userId: String
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty.Builder)
      .secretAccessKey(secretAccessKey)
      .datakey(datakey)
      .accessKeyId(accessKeyId)
      .userId(userId)
      .build()
}
