package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WeightedTargetProperty {

  def apply(
    weight: Option[Number] = None,
    virtualNode: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty.Builder)
      .weight(weight.orNull)
      .virtualNode(virtualNode.orNull)
      .build()
}
