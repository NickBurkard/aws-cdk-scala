package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserQuickConnectConfigProperty {

  def apply(
    contactFlowArn: String,
    userArn: String
  ): software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty =
    (new software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty.Builder)
      .contactFlowArn(contactFlowArn)
      .userArn(userArn)
      .build()
}
