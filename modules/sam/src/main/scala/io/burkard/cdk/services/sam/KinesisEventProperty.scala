package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisEventProperty {

  def apply(
    batchSize: Option[Number] = None,
    enabled: Option[Boolean] = None,
    stream: Option[String] = None,
    startingPosition: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder)
      .batchSize(batchSize.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stream(stream.orNull)
      .startingPosition(startingPosition.orNull)
      .build()
}
