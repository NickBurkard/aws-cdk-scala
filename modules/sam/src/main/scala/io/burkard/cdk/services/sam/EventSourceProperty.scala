package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventSourceProperty {

  def apply(
    properties0: Option[software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty] = None,
    properties1: Option[software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty] = None,
    properties2: Option[software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty] = None,
    properties3: Option[software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty] = None,
    properties4: Option[software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty] = None,
    properties5: Option[software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty] = None,
    properties6: Option[software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty] = None,
    properties7: Option[software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty] = None,
    properties8: Option[software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty] = None,
    properties9: Option[software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty] = None,
    properties10: Option[software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty] = None,
    properties11: Option[software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.Builder)
      .properties(properties0.orNull)
      .properties(properties1.orNull)
      .properties(properties2.orNull)
      .properties(properties3.orNull)
      .properties(properties4.orNull)
      .properties(properties5.orNull)
      .properties(properties6.orNull)
      .properties(properties7.orNull)
      .properties(properties8.orNull)
      .properties(properties9.orNull)
      .properties(properties10.orNull)
      .properties(properties11.orNull)
      .`type`(`type`.orNull)
      .build()
}
