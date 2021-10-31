package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedshiftConnectorProfilePropertiesProperty {

  def apply(
    bucketPrefix: Option[String] = None,
    databaseUrl: Option[String] = None,
    roleArn: Option[String] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty.Builder)
      .bucketPrefix(bucketPrefix.orNull)
      .databaseUrl(databaseUrl.orNull)
      .roleArn(roleArn.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
