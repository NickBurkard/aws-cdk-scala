package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisEventProperty {

  def apply(
    stream: String,
    startingPosition: String,
    batchSize: Option[Number] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder)
      .stream(stream)
      .startingPosition(startingPosition)
      .batchSize(batchSize.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
