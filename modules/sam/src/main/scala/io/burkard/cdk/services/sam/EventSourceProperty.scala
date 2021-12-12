package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventSourceProperty {

  def apply(
    properties0: software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty,
    properties1: software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty,
    properties2: software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty,
    properties3: software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty,
    properties4: software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty,
    properties5: software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty,
    properties6: software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty,
    properties7: software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty,
    properties8: software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty,
    properties9: software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty,
    properties10: software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty,
    properties11: software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty,
    `type`: String
  ): software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.Builder)
      .properties(properties0)
      .properties(properties1)
      .properties(properties2)
      .properties(properties3)
      .properties(properties4)
      .properties(properties5)
      .properties(properties6)
      .properties(properties7)
      .properties(properties8)
      .properties(properties9)
      .properties(properties10)
      .properties(properties11)
      .`type`(`type`)
      .build()
}
