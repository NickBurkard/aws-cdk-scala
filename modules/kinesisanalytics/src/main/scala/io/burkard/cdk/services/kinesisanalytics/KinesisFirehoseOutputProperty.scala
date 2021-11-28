package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisFirehoseOutputProperty {

  def apply(
    resourceArn: String,
    roleArn: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder)
      .resourceArn(resourceArn)
      .roleArn(roleArn)
      .build()
}
