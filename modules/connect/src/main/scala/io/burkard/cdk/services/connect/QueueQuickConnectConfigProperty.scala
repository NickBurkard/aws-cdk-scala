package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueueQuickConnectConfigProperty {

  def apply(
    queueArn: String,
    contactFlowArn: String
  ): software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty =
    (new software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty.Builder)
      .queueArn(queueArn)
      .contactFlowArn(contactFlowArn)
      .build()
}
