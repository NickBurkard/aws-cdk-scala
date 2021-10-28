package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ForwardOptions {

  def apply(
    stickinessDuration: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions.Builder)
      .stickinessDuration(stickinessDuration.orNull)
      .build()
}
