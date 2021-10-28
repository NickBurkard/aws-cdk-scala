package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DynamoDBProperty {

  def apply(
    hashKeyValue: Option[String] = None,
    hashKeyType: Option[String] = None,
    operation: Option[String] = None,
    tableName: Option[String] = None,
    payloadField: Option[String] = None,
    rangeKeyField: Option[String] = None,
    rangeKeyType: Option[String] = None,
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None,
    rangeKeyValue: Option[String] = None,
    hashKeyField: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty.Builder)
      .hashKeyValue(hashKeyValue.orNull)
      .hashKeyType(hashKeyType.orNull)
      .operation(operation.orNull)
      .tableName(tableName.orNull)
      .payloadField(payloadField.orNull)
      .rangeKeyField(rangeKeyField.orNull)
      .rangeKeyType(rangeKeyType.orNull)
      .payload(payload.orNull)
      .rangeKeyValue(rangeKeyValue.orNull)
      .hashKeyField(hashKeyField.orNull)
      .build()
}
