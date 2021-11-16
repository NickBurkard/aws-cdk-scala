package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PhoneNumberQuickConnectConfigProperty {

  def apply(
    phoneNumber: String
  ): software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty =
    (new software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty.Builder)
      .phoneNumber(phoneNumber)
      .build()
}
