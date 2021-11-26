package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisStreamsOutputProperty {

  def apply(
    resourceArn: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty.Builder)
      .resourceArn(resourceArn)
      .build()
}
