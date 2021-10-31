package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionProperty {

  def apply(
    s3: Option[software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty] = None,
    cloudwatchAlarm: Option[software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty] = None,
    dynamoDBv2: Option[software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty] = None,
    cloudwatchLogs: Option[software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty] = None,
    openSearch: Option[software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty] = None,
    dynamoDb: Option[software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty] = None,
    firehose: Option[software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty] = None,
    http: Option[software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty] = None,
    stepFunctions: Option[software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty] = None,
    sns: Option[software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty] = None,
    iotEvents: Option[software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty] = None,
    lambda: Option[software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty] = None,
    elasticsearch: Option[software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty] = None,
    iotAnalytics: Option[software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty] = None,
    kafka: Option[software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty] = None,
    iotSiteWise: Option[software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty] = None,
    sqs: Option[software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty] = None,
    timestream: Option[software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty] = None,
    cloudwatchMetric: Option[software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty] = None,
    republish: Option[software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty] = None,
    kinesis: Option[software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder)
      .s3(s3.orNull)
      .cloudwatchAlarm(cloudwatchAlarm.orNull)
      .dynamoDBv2(dynamoDBv2.orNull)
      .cloudwatchLogs(cloudwatchLogs.orNull)
      .openSearch(openSearch.orNull)
      .dynamoDb(dynamoDb.orNull)
      .firehose(firehose.orNull)
      .http(http.orNull)
      .stepFunctions(stepFunctions.orNull)
      .sns(sns.orNull)
      .iotEvents(iotEvents.orNull)
      .lambda(lambda.orNull)
      .elasticsearch(elasticsearch.orNull)
      .iotAnalytics(iotAnalytics.orNull)
      .kafka(kafka.orNull)
      .iotSiteWise(iotSiteWise.orNull)
      .sqs(sqs.orNull)
      .timestream(timestream.orNull)
      .cloudwatchMetric(cloudwatchMetric.orNull)
      .republish(republish.orNull)
      .kinesis(kinesis.orNull)
      .build()
}
