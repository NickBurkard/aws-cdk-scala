package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPartitionProps {

  def apply(
    tableName: String,
    catalogId: String,
    partitionInput: software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty,
    databaseName: String
  ): software.amazon.awscdk.services.glue.CfnPartitionProps =
    (new software.amazon.awscdk.services.glue.CfnPartitionProps.Builder)
      .tableName(tableName)
      .catalogId(catalogId)
      .partitionInput(partitionInput)
      .databaseName(databaseName)
      .build()
}
