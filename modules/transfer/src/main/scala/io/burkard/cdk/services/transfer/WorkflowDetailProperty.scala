package io.burkard.cdk.services.transfer

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WorkflowDetailProperty {

  def apply(
    executionRole: String,
    workflowId: String
  ): software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty =
    (new software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty.Builder)
      .executionRole(executionRole)
      .workflowId(workflowId)
      .build()
}
