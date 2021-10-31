package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationOutput {

  def apply(
    internalResourceId: String,
    applicationName: Option[String] = None,
    output: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput =
    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.Builder
      .create(stackCtx, internalResourceId)
      .applicationName(applicationName.orNull)
      .output(output.orNull)
      .build()
}
