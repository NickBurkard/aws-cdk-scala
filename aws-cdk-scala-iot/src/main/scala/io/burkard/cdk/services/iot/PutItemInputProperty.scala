package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PutItemInputProperty {

  def apply(
    tableName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.Builder)
      .tableName(tableName.orNull)
      .build()
}
