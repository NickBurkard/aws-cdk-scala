package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisStreamsInputProperty {

  def apply(
    resourceArn: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty.Builder)
      .resourceArn(resourceArn)
      .build()
}
