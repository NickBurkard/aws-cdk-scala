package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SendingOptionsProperty {

  def apply(
    sendingEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty.Builder)
      .sendingEnabled(sendingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
