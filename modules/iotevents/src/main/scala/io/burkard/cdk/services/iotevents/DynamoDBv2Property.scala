package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DynamoDBv2Property {

  def apply(
    tableName: String,
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property.Builder)
      .tableName(tableName)
      .payload(payload.orNull)
      .build()
}
