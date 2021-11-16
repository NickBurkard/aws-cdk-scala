package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EvaluateOnExitProperty {

  def apply(
    action: String,
    onStatusReason: Option[String] = None,
    onReason: Option[String] = None,
    onExitCode: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty.Builder)
      .action(action)
      .onStatusReason(onStatusReason.orNull)
      .onReason(onReason.orNull)
      .onExitCode(onExitCode.orNull)
      .build()
}
