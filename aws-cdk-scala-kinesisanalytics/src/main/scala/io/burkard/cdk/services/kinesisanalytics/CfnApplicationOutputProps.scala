package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplicationOutputProps {

  def apply(
    applicationName: Option[String] = None,
    output: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps.Builder)
      .applicationName(applicationName.orNull)
      .output(output.orNull)
      .build()
}
