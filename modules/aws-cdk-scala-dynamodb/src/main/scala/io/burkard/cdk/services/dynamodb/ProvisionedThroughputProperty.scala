package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProvisionedThroughputProperty {

  def apply(
    writeCapacityUnits: Option[Number] = None,
    readCapacityUnits: Option[Number] = None
  ): software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.Builder)
      .writeCapacityUnits(writeCapacityUnits.orNull)
      .readCapacityUnits(readCapacityUnits.orNull)
      .build()
}
