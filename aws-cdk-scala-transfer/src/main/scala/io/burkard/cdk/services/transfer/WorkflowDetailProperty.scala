package io.burkard.cdk.services.transfer

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WorkflowDetailProperty {

  def apply(
    executionRole: Option[String] = None,
    workflowId: Option[String] = None
  ): software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty =
    (new software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty.Builder)
      .executionRole(executionRole.orNull)
      .workflowId(workflowId.orNull)
      .build()
}
