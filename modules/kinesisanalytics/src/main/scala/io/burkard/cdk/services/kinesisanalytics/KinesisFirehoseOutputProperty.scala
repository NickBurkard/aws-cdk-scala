package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisFirehoseOutputProperty {

  def apply(
    resourceArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty.Builder)
      .resourceArn(resourceArn.orNull)
      .build()
}
