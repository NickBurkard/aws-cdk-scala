package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchLoggingOptionProperty {

  def apply(
    logStreamArn: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.Builder)
      .logStreamArn(logStreamArn)
      .build()
}
