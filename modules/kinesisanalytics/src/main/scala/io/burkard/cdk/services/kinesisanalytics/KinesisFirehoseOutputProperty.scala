package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisFirehoseOutputProperty {

  def apply(
    resourceArn: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder)
      .resourceArn(resourceArn.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
