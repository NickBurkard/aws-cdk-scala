package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeliveryOptionsProperty {

  def apply(
    sendingPoolName: Option[String] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty.Builder)
      .sendingPoolName(sendingPoolName.orNull)
      .build()
}
