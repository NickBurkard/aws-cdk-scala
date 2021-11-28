package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubjectAlternativeNamesProperty {

  def apply(
    `match`: software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty.Builder)
      .`match`(`match`)
      .build()
}
