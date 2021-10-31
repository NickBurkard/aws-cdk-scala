package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationCloudWatchLoggingOptionV2Props {

  def apply(
    cloudWatchLoggingOption: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty] = None,
    applicationName: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props.Builder)
      .cloudWatchLoggingOption(cloudWatchLoggingOption.orNull)
      .applicationName(applicationName.orNull)
      .build()
}
