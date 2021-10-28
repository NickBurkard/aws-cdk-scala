package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PhoneNumberQuickConnectConfigProperty {

  def apply(
    phoneNumber: Option[String] = None
  ): software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty =
    (new software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty.Builder)
      .phoneNumber(phoneNumber.orNull)
      .build()
}
