package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WeightedTarget {

  def apply(
    weight: Option[Number] = None,
    virtualNode: Option[software.amazon.awscdk.services.appmesh.IVirtualNode] = None
  ): software.amazon.awscdk.services.appmesh.WeightedTarget =
    (new software.amazon.awscdk.services.appmesh.WeightedTarget.Builder)
      .weight(weight.orNull)
      .virtualNode(virtualNode.orNull)
      .build()
}
