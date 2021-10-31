package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputProperty {

  def apply(
    inputSchema: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty] = None,
    namePrefix: Option[String] = None,
    kinesisFirehoseInput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty] = None,
    inputParallelism: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty] = None,
    kinesisStreamsInput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty] = None,
    inputProcessingConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder)
      .inputSchema(inputSchema.orNull)
      .namePrefix(namePrefix.orNull)
      .kinesisFirehoseInput(kinesisFirehoseInput.orNull)
      .inputParallelism(inputParallelism.orNull)
      .kinesisStreamsInput(kinesisStreamsInput.orNull)
      .inputProcessingConfiguration(inputProcessingConfiguration.orNull)
      .build()
}
