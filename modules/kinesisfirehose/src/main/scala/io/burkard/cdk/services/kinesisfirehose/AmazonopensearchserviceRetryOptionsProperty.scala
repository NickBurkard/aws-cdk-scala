package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AmazonopensearchserviceRetryOptionsProperty {

  def apply(
    durationInSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty.Builder)
      .durationInSeconds(durationInSeconds.orNull)
      .build()
}
