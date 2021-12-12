package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisFirehoseInputProperty {

  def apply(
    resourceArn: String,
    roleArn: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.Builder)
      .resourceArn(resourceArn)
      .roleArn(roleArn)
      .build()
}
