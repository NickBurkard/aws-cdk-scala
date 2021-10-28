package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LifecycleHookTargetConfig {

  def apply(
    notificationTargetArn: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig =
    (new software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig.Builder)
      .notificationTargetArn(notificationTargetArn.orNull)
      .build()
}
