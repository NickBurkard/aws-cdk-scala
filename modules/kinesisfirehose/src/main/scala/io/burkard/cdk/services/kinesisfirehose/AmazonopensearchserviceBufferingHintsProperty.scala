package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AmazonopensearchserviceBufferingHintsProperty {

  def apply(
    sizeInMBs: Option[Number] = None,
    intervalInSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty.Builder)
      .sizeInMBs(sizeInMBs.orNull)
      .intervalInSeconds(intervalInSeconds.orNull)
      .build()
}
