package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetDescriptionProperty {

  def apply(
    id: String,
    availabilityZone: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty.Builder)
      .id(id)
      .availabilityZone(availabilityZone.orNull)
      .port(port.orNull)
      .build()
}
