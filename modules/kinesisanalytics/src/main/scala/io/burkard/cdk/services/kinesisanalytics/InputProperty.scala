package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputProperty {

  def apply(
    inputSchema: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty] = None,
    namePrefix: Option[String] = None,
    kinesisFirehoseInput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty] = None,
    inputParallelism: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty] = None,
    kinesisStreamsInput: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty] = None,
    inputProcessingConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder)
      .inputSchema(inputSchema.orNull)
      .namePrefix(namePrefix.orNull)
      .kinesisFirehoseInput(kinesisFirehoseInput.orNull)
      .inputParallelism(inputParallelism.orNull)
      .kinesisStreamsInput(kinesisStreamsInput.orNull)
      .inputProcessingConfiguration(inputProcessingConfiguration.orNull)
      .build()
}
