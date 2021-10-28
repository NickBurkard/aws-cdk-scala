package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DynamoDBv2Property {

  def apply(
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None,
    tableName: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property.Builder)
      .payload(payload.orNull)
      .tableName(tableName.orNull)
      .build()
}
