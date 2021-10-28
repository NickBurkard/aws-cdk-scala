package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplicationCloudWatchLoggingOptionV2 {

  def apply(
    internalResourceId: String,
    cloudWatchLoggingOption: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty] = None,
    applicationName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2 =
    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.Builder
      .create(stackCtx, internalResourceId)
      .cloudWatchLoggingOption(cloudWatchLoggingOption.orNull)
      .applicationName(applicationName.orNull)
      .build()
}
