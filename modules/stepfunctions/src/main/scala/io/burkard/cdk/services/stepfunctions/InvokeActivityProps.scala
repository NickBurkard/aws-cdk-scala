package io.burkard.cdk.services.stepfunctions

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InvokeActivityProps {

  def apply(
    heartbeat: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.InvokeActivityProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.InvokeActivityProps.Builder)
      .heartbeat(heartbeat.orNull)
      .build()
}
