package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPartition {

  def apply(
    internalResourceId: String,
    tableName: Option[String] = None,
    catalogId: Option[String] = None,
    partitionInput: Option[software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty] = None,
    databaseName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnPartition =
    software.amazon.awscdk.services.glue.CfnPartition.Builder
      .create(stackCtx, internalResourceId)
      .tableName(tableName.orNull)
      .catalogId(catalogId.orNull)
      .partitionInput(partitionInput.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
