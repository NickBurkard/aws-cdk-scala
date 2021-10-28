package io.burkard.cdk.services.cassandra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProvisionedThroughputProperty {

  def apply(
    writeCapacityUnits: Option[Number] = None,
    readCapacityUnits: Option[Number] = None
  ): software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty =
    (new software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty.Builder)
      .writeCapacityUnits(writeCapacityUnits.orNull)
      .readCapacityUnits(readCapacityUnits.orNull)
      .build()
}
