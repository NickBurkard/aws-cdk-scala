package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionProperty {

  def apply(
    setTimer: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty] = None,
    resetTimer: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty] = None,
    dynamoDBv2: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property] = None,
    setVariable: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty] = None,
    lambda: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty] = None,
    dynamoDb: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty] = None,
    iotTopicPublish: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty] = None,
    firehose: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty] = None,
    clearTimer: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty] = None,
    sns: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty] = None,
    iotEvents: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty] = None,
    iotSiteWise: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty] = None,
    sqs: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty.Builder)
      .setTimer(setTimer.orNull)
      .resetTimer(resetTimer.orNull)
      .dynamoDBv2(dynamoDBv2.orNull)
      .setVariable(setVariable.orNull)
      .lambda(lambda.orNull)
      .dynamoDb(dynamoDb.orNull)
      .iotTopicPublish(iotTopicPublish.orNull)
      .firehose(firehose.orNull)
      .clearTimer(clearTimer.orNull)
      .sns(sns.orNull)
      .iotEvents(iotEvents.orNull)
      .iotSiteWise(iotSiteWise.orNull)
      .sqs(sqs.orNull)
      .build()
}
