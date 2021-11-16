package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationOutput {

  def apply(
    internalResourceId: String,
    applicationName: String,
    output: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput =
    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.Builder
      .create(stackCtx, internalResourceId)
      .applicationName(applicationName)
      .output(output)
      .build()
}
