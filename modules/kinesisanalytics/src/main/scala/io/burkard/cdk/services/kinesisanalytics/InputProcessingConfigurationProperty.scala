package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputProcessingConfigurationProperty {

  def apply(
    inputLambdaProcessor: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty.Builder)
      .inputLambdaProcessor(inputLambdaProcessor.orNull)
      .build()
}
