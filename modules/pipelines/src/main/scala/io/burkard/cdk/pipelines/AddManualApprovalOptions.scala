package io.burkard.cdk.pipelines

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
