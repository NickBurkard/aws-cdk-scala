package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SqsEventSource {

  def apply(
    queue: software.amazon.awscdk.services.sqs.IQueue,
    batchSize: Option[Number] = None,
    enabled: Option[Boolean] = None,
    maxBatchingWindow: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.lambda.eventsources.SqsEventSource =
    software.amazon.awscdk.services.lambda.eventsources.SqsEventSource.Builder
      .create(queue)
      .batchSize(batchSize.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxBatchingWindow(maxBatchingWindow.orNull)
      .build()
}
