package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedshiftConnectorProfilePropertiesProperty {

  def apply(
    databaseUrl: String,
    roleArn: String,
    bucketName: String,
    bucketPrefix: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty.Builder)
      .databaseUrl(databaseUrl)
      .roleArn(roleArn)
      .bucketName(bucketName)
      .bucketPrefix(bucketPrefix.orNull)
      .build()
}
