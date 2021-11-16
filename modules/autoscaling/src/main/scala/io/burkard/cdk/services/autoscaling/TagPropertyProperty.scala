package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagPropertyProperty {

  def apply(
    key: String,
    propagateAtLaunch: Boolean,
    value: String
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder)
      .key(key)
      .propagateAtLaunch(propagateAtLaunch)
      .value(value)
      .build()
}
