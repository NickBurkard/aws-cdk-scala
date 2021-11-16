package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SQSEventProperty {

  def apply(
    queue: String,
    batchSize: Option[Number] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder)
      .queue(queue)
      .batchSize(batchSize.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
