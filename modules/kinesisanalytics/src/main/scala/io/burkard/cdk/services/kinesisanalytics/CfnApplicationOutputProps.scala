package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationOutputProps {

  def apply(
    applicationName: String,
    output: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps.Builder)
      .applicationName(applicationName)
      .output(output)
      .build()
}
