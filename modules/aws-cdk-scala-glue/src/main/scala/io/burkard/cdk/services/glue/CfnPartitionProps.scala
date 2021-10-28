package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPartitionProps {

  def apply(
    tableName: Option[String] = None,
    catalogId: Option[String] = None,
    partitionInput: Option[software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnPartitionProps =
    (new software.amazon.awscdk.services.glue.CfnPartitionProps.Builder)
      .tableName(tableName.orNull)
      .catalogId(catalogId.orNull)
      .partitionInput(partitionInput.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
