package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QuickConnectConfigProperty {

  def apply(
    quickConnectType: Option[String] = None,
    userConfig: Option[software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty] = None,
    phoneConfig: Option[software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty] = None,
    queueConfig: Option[software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty] = None
  ): software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty =
    (new software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty.Builder)
      .quickConnectType(quickConnectType.orNull)
      .userConfig(userConfig.orNull)
      .phoneConfig(phoneConfig.orNull)
      .queueConfig(queueConfig.orNull)
      .build()
}
