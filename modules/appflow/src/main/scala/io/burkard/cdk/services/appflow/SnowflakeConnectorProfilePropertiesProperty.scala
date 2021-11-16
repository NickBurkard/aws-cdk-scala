package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnowflakeConnectorProfilePropertiesProperty {

  def apply(
    stage: String,
    bucketName: String,
    warehouse: String,
    accountName: Option[String] = None,
    privateLinkServiceName: Option[String] = None,
    bucketPrefix: Option[String] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty.Builder)
      .stage(stage)
      .bucketName(bucketName)
      .warehouse(warehouse)
      .accountName(accountName.orNull)
      .privateLinkServiceName(privateLinkServiceName.orNull)
      .bucketPrefix(bucketPrefix.orNull)
      .region(region.orNull)
      .build()
}
