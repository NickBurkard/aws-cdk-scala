package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WeightedTargetProperty {

  def apply(
    weight: Number,
    virtualNode: String
  ): software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty.Builder)
      .weight(weight)
      .virtualNode(virtualNode)
      .build()
}
