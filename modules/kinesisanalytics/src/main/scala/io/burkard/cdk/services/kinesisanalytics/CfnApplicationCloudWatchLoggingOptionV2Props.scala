package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationCloudWatchLoggingOptionV2Props {

  def apply(
    cloudWatchLoggingOption: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty,
    applicationName: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props.Builder)
      .cloudWatchLoggingOption(cloudWatchLoggingOption)
      .applicationName(applicationName)
      .build()
}
