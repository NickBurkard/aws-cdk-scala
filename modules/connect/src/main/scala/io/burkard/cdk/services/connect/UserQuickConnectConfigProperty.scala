package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserQuickConnectConfigProperty {

  def apply(
    contactFlowArn: Option[String] = None,
    userArn: Option[String] = None
  ): software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty =
    (new software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty.Builder)
      .contactFlowArn(contactFlowArn.orNull)
      .userArn(userArn.orNull)
      .build()
}
