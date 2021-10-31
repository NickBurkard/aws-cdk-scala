package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputProcessingConfigurationProperty {

  def apply(
    inputLambdaProcessor: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty.Builder)
      .inputLambdaProcessor(inputLambdaProcessor.orNull)
      .build()
}
