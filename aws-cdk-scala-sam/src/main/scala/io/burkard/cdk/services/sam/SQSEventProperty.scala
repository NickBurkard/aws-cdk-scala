package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SQSEventProperty {

  def apply(
    batchSize: Option[Number] = None,
    queue: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder)
      .batchSize(batchSize.orNull)
      .queue(queue.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
