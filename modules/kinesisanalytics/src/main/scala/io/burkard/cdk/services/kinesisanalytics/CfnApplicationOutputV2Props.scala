package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationOutputV2Props {

  def apply(
    applicationName: String,
    output: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.Builder)
      .applicationName(applicationName)
      .output(output)
      .build()
}
