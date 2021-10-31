package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DynamoDBActionProperty {

  def apply(
    rangeKeyType: Option[String] = None,
    hashKeyValue: Option[String] = None,
    hashKeyType: Option[String] = None,
    tableName: Option[String] = None,
    roleArn: Option[String] = None,
    payloadField: Option[String] = None,
    rangeKeyField: Option[String] = None,
    rangeKeyValue: Option[String] = None,
    hashKeyField: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder)
      .rangeKeyType(rangeKeyType.orNull)
      .hashKeyValue(hashKeyValue.orNull)
      .hashKeyType(hashKeyType.orNull)
      .tableName(tableName.orNull)
      .roleArn(roleArn.orNull)
      .payloadField(payloadField.orNull)
      .rangeKeyField(rangeKeyField.orNull)
      .rangeKeyValue(rangeKeyValue.orNull)
      .hashKeyField(hashKeyField.orNull)
      .build()
}
