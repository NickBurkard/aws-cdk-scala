package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FirehoseProperty {

  def apply(
    enabled: Boolean,
    deliveryStream: Option[String] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty.Builder)
      .enabled(enabled)
      .deliveryStream(deliveryStream.orNull)
      .build()
}
