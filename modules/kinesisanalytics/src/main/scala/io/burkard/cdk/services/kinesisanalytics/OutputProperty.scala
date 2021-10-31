package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputProperty {

  def apply(
    name: Option[String] = None,
    lambdaOutput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty] = None,
    kinesisStreamsOutput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty] = None,
    destinationSchema: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty] = None,
    kinesisFirehoseOutput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder)
      .name(name.orNull)
      .lambdaOutput(lambdaOutput.orNull)
      .kinesisStreamsOutput(kinesisStreamsOutput.orNull)
      .destinationSchema(destinationSchema.orNull)
      .kinesisFirehoseOutput(kinesisFirehoseOutput.orNull)
      .build()
}
