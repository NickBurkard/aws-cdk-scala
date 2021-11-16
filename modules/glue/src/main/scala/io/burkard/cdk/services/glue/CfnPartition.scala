package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPartition {

  def apply(
    internalResourceId: String,
    tableName: String,
    catalogId: String,
    partitionInput: software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty,
    databaseName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnPartition =
    software.amazon.awscdk.services.glue.CfnPartition.Builder
      .create(stackCtx, internalResourceId)
      .tableName(tableName)
      .catalogId(catalogId)
      .partitionInput(partitionInput)
      .databaseName(databaseName)
      .build()
}
