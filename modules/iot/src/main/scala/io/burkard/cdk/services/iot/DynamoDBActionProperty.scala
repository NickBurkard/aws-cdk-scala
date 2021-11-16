package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DynamoDBActionProperty {

  def apply(
    hashKeyValue: String,
    tableName: String,
    roleArn: String,
    hashKeyField: String,
    rangeKeyType: Option[String] = None,
    hashKeyType: Option[String] = None,
    payloadField: Option[String] = None,
    rangeKeyField: Option[String] = None,
    rangeKeyValue: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder)
      .hashKeyValue(hashKeyValue)
      .tableName(tableName)
      .roleArn(roleArn)
      .hashKeyField(hashKeyField)
      .rangeKeyType(rangeKeyType.orNull)
      .hashKeyType(hashKeyType.orNull)
      .payloadField(payloadField.orNull)
      .rangeKeyField(rangeKeyField.orNull)
      .rangeKeyValue(rangeKeyValue.orNull)
      .build()
}
