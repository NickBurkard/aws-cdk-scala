package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputLambdaProcessorProperty {

  def apply(
    resourceArn: String,
    roleArn: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty.Builder)
      .resourceArn(resourceArn)
      .roleArn(roleArn)
      .build()
}
