package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetDescriptionProperty {

  def apply(
    availabilityZone: Option[String] = None,
    id: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty.Builder)
      .availabilityZone(availabilityZone.orNull)
      .id(id.orNull)
      .port(port.orNull)
      .build()
}
