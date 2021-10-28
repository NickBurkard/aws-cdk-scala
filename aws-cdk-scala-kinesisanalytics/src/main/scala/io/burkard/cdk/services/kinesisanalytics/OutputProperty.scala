package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OutputProperty {

  def apply(
    name: Option[String] = None,
    lambdaOutput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty] = None,
    kinesisStreamsOutput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty] = None,
    destinationSchema: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty] = None,
    kinesisFirehoseOutput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder)
      .name(name.orNull)
      .lambdaOutput(lambdaOutput.orNull)
      .kinesisStreamsOutput(kinesisStreamsOutput.orNull)
      .destinationSchema(destinationSchema.orNull)
      .kinesisFirehoseOutput(kinesisFirehoseOutput.orNull)
      .build()
}
