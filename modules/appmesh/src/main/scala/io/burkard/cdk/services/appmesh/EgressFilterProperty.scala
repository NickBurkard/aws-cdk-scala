package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EgressFilterProperty {

  def apply(
    `type`: String
  ): software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty =
    (new software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty.Builder)
      .`type`(`type`)
      .build()
}
