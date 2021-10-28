package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqsEventSourceProps {

  def apply(
    batchSize: Option[Number] = None,
    enabled: Option[Boolean] = None,
    maxBatchingWindow: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps =
    (new software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps.Builder)
      .batchSize(batchSize.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxBatchingWindow(maxBatchingWindow.orNull)
      .build()
}
