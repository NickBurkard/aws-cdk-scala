package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KinesisFirehoseInputProperty {

  def apply(
    resourceArn: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.Builder)
      .resourceArn(resourceArn.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
