package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfigSnapshotDeliveryPropertiesProperty {

  def apply(
    deliveryFrequency: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty =
    (new software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder)
      .deliveryFrequency(deliveryFrequency.orNull)
      .build()
}
