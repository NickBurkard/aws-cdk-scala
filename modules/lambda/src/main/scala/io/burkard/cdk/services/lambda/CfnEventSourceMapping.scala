package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEventSourceMapping {

  def apply(
    internalResourceId: String,
    topics: Option[List[String]] = None,
    selfManagedEventSource: Option[software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty] = None,
    functionName: Option[String] = None,
    batchSize: Option[Number] = None,
    sourceAccessConfigurations: Option[List[_]] = None,
    queues: Option[List[String]] = None,
    eventSourceArn: Option[String] = None,
    startingPosition: Option[String] = None,
    maximumRecordAgeInSeconds: Option[Number] = None,
    parallelizationFactor: Option[Number] = None,
    maximumBatchingWindowInSeconds: Option[Number] = None,
    enabled: Option[Boolean] = None,
    destinationConfig: Option[software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty] = None,
    tumblingWindowInSeconds: Option[Number] = None,
    bisectBatchOnFunctionError: Option[Boolean] = None,
    startingPositionTimestamp: Option[Number] = None,
    functionResponseTypes: Option[List[String]] = None,
    maximumRetryAttempts: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CfnEventSourceMapping =
    software.amazon.awscdk.services.lambda.CfnEventSourceMapping.Builder
      .create(stackCtx, internalResourceId)
      .topics(topics.map(_.asJava).orNull)
      .selfManagedEventSource(selfManagedEventSource.orNull)
      .functionName(functionName.orNull)
      .batchSize(batchSize.orNull)
      .sourceAccessConfigurations(sourceAccessConfigurations.map(_.asJava).orNull)
      .queues(queues.map(_.asJava).orNull)
      .eventSourceArn(eventSourceArn.orNull)
      .startingPosition(startingPosition.orNull)
      .maximumRecordAgeInSeconds(maximumRecordAgeInSeconds.orNull)
      .parallelizationFactor(parallelizationFactor.orNull)
      .maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .destinationConfig(destinationConfig.orNull)
      .tumblingWindowInSeconds(tumblingWindowInSeconds.orNull)
      .bisectBatchOnFunctionError(bisectBatchOnFunctionError.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .startingPositionTimestamp(startingPositionTimestamp.orNull)
      .functionResponseTypes(functionResponseTypes.map(_.asJava).orNull)
      .maximumRetryAttempts(maximumRetryAttempts.orNull)
      .build()
}
