package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SchemaConfigurationProperty {

  def apply(
    versionId: Option[String] = None,
    tableName: Option[String] = None,
    roleArn: Option[String] = None,
    catalogId: Option[String] = None,
    region: Option[String] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty.Builder)
      .versionId(versionId.orNull)
      .tableName(tableName.orNull)
      .roleArn(roleArn.orNull)
      .catalogId(catalogId.orNull)
      .region(region.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
