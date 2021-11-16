package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PutItemInputProperty {

  def apply(
    tableName: String
  ): software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.Builder)
      .tableName(tableName)
      .build()
}
