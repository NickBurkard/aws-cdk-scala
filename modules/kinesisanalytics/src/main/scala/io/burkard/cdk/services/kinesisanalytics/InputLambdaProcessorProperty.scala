package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputLambdaProcessorProperty {

  def apply(
    resourceArn: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty.Builder)
      .resourceArn(resourceArn)
      .build()
}
