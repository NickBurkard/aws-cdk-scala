package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LifecycleHookTargetConfig {

  def apply(
    notificationTargetArn: String
  ): software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig =
    (new software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig.Builder)
      .notificationTargetArn(notificationTargetArn)
      .build()
}
