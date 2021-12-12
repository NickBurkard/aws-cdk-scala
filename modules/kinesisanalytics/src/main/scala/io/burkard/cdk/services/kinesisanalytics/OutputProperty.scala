package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputProperty {

  def apply(
    destinationSchema: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty,
    name: Option[String] = None,
    lambdaOutput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty] = None,
    kinesisStreamsOutput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty] = None,
    kinesisFirehoseOutput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder)
      .destinationSchema(destinationSchema)
      .name(name.orNull)
      .lambdaOutput(lambdaOutput.orNull)
      .kinesisStreamsOutput(kinesisStreamsOutput.orNull)
      .kinesisFirehoseOutput(kinesisFirehoseOutput.orNull)
      .build()
}
