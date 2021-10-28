package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TrackingOptionsProperty {

  def apply(
    customRedirectDomain: Option[String] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty.Builder)
      .customRedirectDomain(customRedirectDomain.orNull)
      .build()
}
