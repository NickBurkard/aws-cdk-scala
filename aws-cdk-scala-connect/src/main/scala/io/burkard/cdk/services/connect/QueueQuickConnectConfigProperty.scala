package io.burkard.cdk.services.connect

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object QueueQuickConnectConfigProperty {

  def apply(
    queueArn: Option[String] = None,
    contactFlowArn: Option[String] = None
  ): software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty =
    (new software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty.Builder)
      .queueArn(queueArn.orNull)
      .contactFlowArn(contactFlowArn.orNull)
      .build()
}
