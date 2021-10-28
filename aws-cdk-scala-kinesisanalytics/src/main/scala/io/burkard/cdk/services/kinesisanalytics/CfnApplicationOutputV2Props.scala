package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplicationOutputV2Props {

  def apply(
    applicationName: Option[String] = None,
    output: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.Builder)
      .applicationName(applicationName.orNull)
      .output(output.orNull)
      .build()
}
