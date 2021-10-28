package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AddManualApprovalOptions {

  def apply(
    runOrder: Option[Number] = None,
    actionName: Option[String] = None
  ): software.amazon.awscdk.pipelines.AddManualApprovalOptions =
    (new software.amazon.awscdk.pipelines.AddManualApprovalOptions.Builder)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .build()
}
