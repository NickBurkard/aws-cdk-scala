package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkForwardOptions {

  def apply(
    stickinessDuration: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions.Builder)
      .stickinessDuration(stickinessDuration.orNull)
      .build()
}
