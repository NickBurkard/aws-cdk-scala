package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WeightedTarget {

  def apply(
    virtualNode: software.amazon.awscdk.services.appmesh.IVirtualNode,
    weight: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.WeightedTarget =
    (new software.amazon.awscdk.services.appmesh.WeightedTarget.Builder)
      .virtualNode(virtualNode)
      .weight(weight.orNull)
      .build()
}
