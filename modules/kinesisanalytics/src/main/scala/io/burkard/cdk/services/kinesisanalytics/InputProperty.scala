package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputProperty {

  def apply(
    inputSchema: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty,
    namePrefix: String,
    kinesisFirehoseInput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty] = None,
    inputParallelism: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty] = None,
    kinesisStreamsInput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty] = None,
    inputProcessingConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder)
      .inputSchema(inputSchema)
      .namePrefix(namePrefix)
      .kinesisFirehoseInput(kinesisFirehoseInput.orNull)
      .inputParallelism(inputParallelism.orNull)
      .kinesisStreamsInput(kinesisStreamsInput.orNull)
      .inputProcessingConfiguration(inputProcessingConfiguration.orNull)
      .build()
}
