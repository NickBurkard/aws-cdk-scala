package io.burkard.cdk.services.stepfunctions

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InvokeActivity {

  def apply(
    activity: software.amazon.awscdk.services.stepfunctions.IActivity,
    heartbeat: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.InvokeActivity =
    software.amazon.awscdk.services.stepfunctions.tasks.InvokeActivity.Builder
      .create(activity)
      .heartbeat(heartbeat.orNull)
      .build()
}
