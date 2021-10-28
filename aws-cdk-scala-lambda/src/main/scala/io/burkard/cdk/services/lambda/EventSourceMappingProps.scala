package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventSourceMappingProps {

  def apply(
    batchSize: Option[Number] = None,
    parallelizationFactor: Option[Number] = None,
    enabled: Option[Boolean] = None,
    sourceAccessConfigurations: Option[List[_ <: software.amazon.awscdk.services.lambda.SourceAccessConfiguration]] = None,
    tumblingWindow: Option[software.amazon.awscdk.Duration] = None,
    eventSourceArn: Option[String] = None,
    kafkaBootstrapServers: Option[List[String]] = None,
    target: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    retryAttempts: Option[Number] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.IEventSourceDlq] = None,
    maxRecordAge: Option[software.amazon.awscdk.Duration] = None,
    bisectBatchOnError: Option[Boolean] = None,
    maxBatchingWindow: Option[software.amazon.awscdk.Duration] = None,
    kafkaTopic: Option[String] = None,
    reportBatchItemFailures: Option[Boolean] = None,
    startingPosition: Option[software.amazon.awscdk.services.lambda.StartingPosition] = None
  ): software.amazon.awscdk.services.lambda.EventSourceMappingProps =
    (new software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder)
      .batchSize(batchSize.orNull)
      .parallelizationFactor(parallelizationFactor.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceAccessConfigurations(sourceAccessConfigurations.map(_.asJava).orNull)
      .tumblingWindow(tumblingWindow.orNull)
      .eventSourceArn(eventSourceArn.orNull)
      .kafkaBootstrapServers(kafkaBootstrapServers.map(_.asJava).orNull)
      .target(target.orNull)
      .retryAttempts(retryAttempts.orNull)
      .onFailure(onFailure.orNull)
      .maxRecordAge(maxRecordAge.orNull)
      .bisectBatchOnError(bisectBatchOnError.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxBatchingWindow(maxBatchingWindow.orNull)
      .kafkaTopic(kafkaTopic.orNull)
      .reportBatchItemFailures(reportBatchItemFailures.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .startingPosition(startingPosition.orNull)
      .build()
}
