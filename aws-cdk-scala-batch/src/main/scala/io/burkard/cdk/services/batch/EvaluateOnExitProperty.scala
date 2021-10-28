package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EvaluateOnExitProperty {

  def apply(
    onStatusReason: Option[String] = None,
    onReason: Option[String] = None,
    action: Option[String] = None,
    onExitCode: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty.Builder)
      .onStatusReason(onStatusReason.orNull)
      .onReason(onReason.orNull)
      .action(action.orNull)
      .onExitCode(onExitCode.orNull)
      .build()
}
