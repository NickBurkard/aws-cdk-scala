package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationCloudWatchLoggingOptionV2 {

  def apply(
    internalResourceId: String,
    cloudWatchLoggingOption: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty,
    applicationName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2 =
    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.Builder
      .create(stackCtx, internalResourceId)
      .cloudWatchLoggingOption(cloudWatchLoggingOption)
      .applicationName(applicationName)
      .build()
}
