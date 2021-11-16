package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProvisionedThroughputProperty {

  def apply(
    writeCapacityUnits: Number,
    readCapacityUnits: Number
  ): software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.Builder)
      .writeCapacityUnits(writeCapacityUnits)
      .readCapacityUnits(readCapacityUnits)
      .build()
}
