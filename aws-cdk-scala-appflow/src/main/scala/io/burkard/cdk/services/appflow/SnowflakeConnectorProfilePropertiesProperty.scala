package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SnowflakeConnectorProfilePropertiesProperty {

  def apply(
    stage: Option[String] = None,
    accountName: Option[String] = None,
    privateLinkServiceName: Option[String] = None,
    bucketPrefix: Option[String] = None,
    region: Option[String] = None,
    bucketName: Option[String] = None,
    warehouse: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty.Builder)
      .stage(stage.orNull)
      .accountName(accountName.orNull)
      .privateLinkServiceName(privateLinkServiceName.orNull)
      .bucketPrefix(bucketPrefix.orNull)
      .region(region.orNull)
      .bucketName(bucketName.orNull)
      .warehouse(warehouse.orNull)
      .build()
}
