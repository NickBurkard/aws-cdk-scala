package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StreamEventSourceProps {

  def apply(
    startingPosition: software.amazon.awscdk.services.lambda.StartingPosition,
    batchSize: Option[Number] = None,
    parallelizationFactor: Option[Number] = None,
    enabled: Option[Boolean] = None,
    tumblingWindow: Option[software.amazon.awscdk.Duration] = None,
    maxBatchingWindow: Option[software.amazon.awscdk.Duration] = None,
    retryAttempts: Option[Number] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.IEventSourceDlq] = None,
    maxRecordAge: Option[software.amazon.awscdk.Duration] = None,
    bisectBatchOnError: Option[Boolean] = None,
    reportBatchItemFailures: Option[Boolean] = None
  ): software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps =
    (new software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps.Builder)
      .startingPosition(startingPosition)
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
      .build()
}
