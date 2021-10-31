package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagPropertyProperty {

  def apply(
    key: Option[String] = None,
    propagateAtLaunch: Option[Boolean] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder)
      .key(key.orNull)
      .propagateAtLaunch(propagateAtLaunch.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .value(value.orNull)
      .build()
}
