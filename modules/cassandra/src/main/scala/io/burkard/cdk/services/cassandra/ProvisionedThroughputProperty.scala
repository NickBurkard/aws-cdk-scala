package io.burkard.cdk.services.cassandra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProvisionedThroughputProperty {

  def apply(
    writeCapacityUnits: Number,
    readCapacityUnits: Number
  ): software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty =
    (new software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty.Builder)
      .writeCapacityUnits(writeCapacityUnits)
      .readCapacityUnits(readCapacityUnits)
      .build()
}
