package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DynamoDBProperty {

  def apply(
    hashKeyValue: String,
    tableName: String,
    hashKeyField: String,
    hashKeyType: Option[String] = None,
    operation: Option[String] = None,
    payloadField: Option[String] = None,
    rangeKeyField: Option[String] = None,
    rangeKeyType: Option[String] = None,
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None,
    rangeKeyValue: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty.Builder)
      .hashKeyValue(hashKeyValue)
      .tableName(tableName)
      .hashKeyField(hashKeyField)
      .hashKeyType(hashKeyType.orNull)
      .operation(operation.orNull)
      .payloadField(payloadField.orNull)
      .rangeKeyField(rangeKeyField.orNull)
      .rangeKeyType(rangeKeyType.orNull)
      .payload(payload.orNull)
      .rangeKeyValue(rangeKeyValue.orNull)
      .build()
}
