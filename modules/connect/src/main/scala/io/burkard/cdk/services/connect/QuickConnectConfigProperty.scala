package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QuickConnectConfigProperty {

  def apply(
    quickConnectType: String,
    userConfig: Option[software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty] = None,
    phoneConfig: Option[software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty] = None,
    queueConfig: Option[software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty] = None
  ): software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty =
    (new software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty.Builder)
      .quickConnectType(quickConnectType)
      .userConfig(userConfig.orNull)
      .phoneConfig(phoneConfig.orNull)
      .queueConfig(queueConfig.orNull)
      .build()
}
