package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetGroupAttributeProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
