package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ManagedKafkaEventSource {

  def apply(
    secret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    batchSize: Option[Number] = None,
    parallelizationFactor: Option[Number] = None,
    enabled: Option[Boolean] = None,
    tumblingWindow: Option[software.amazon.awscdk.Duration] = None,
    maxBatchingWindow: Option[software.amazon.awscdk.Duration] = None,
    retryAttempts: Option[Number] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.IEventSourceDlq] = None,
    maxRecordAge: Option[software.amazon.awscdk.Duration] = None,
    bisectBatchOnError: Option[Boolean] = None,
    reportBatchItemFailures: Option[Boolean] = None,
    clusterArn: Option[String] = None,
    startingPosition: Option[software.amazon.awscdk.services.lambda.StartingPosition] = None,
    topic: Option[String] = None
  ): software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSource =
    software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSource.Builder
      .create()
      .secret(secret.orNull)
      .batchSize(batchSize.orNull)
      .parallelizationFactor(parallelizationFactor.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tumblingWindow(tumblingWindow.orNull)
      .maxBatchingWindow(maxBatchingWindow.orNull)
      .retryAttempts(retryAttempts.orNull)
      .onFailure(onFailure.orNull)
      .maxRecordAge(maxRecordAge.orNull)
      .bisectBatchOnError(bisectBatchOnError.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .reportBatchItemFailures(reportBatchItemFailures.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .clusterArn(clusterArn.orNull)
      .startingPosition(startingPosition.orNull)
      .topic(topic.orNull)
      .build()
}
