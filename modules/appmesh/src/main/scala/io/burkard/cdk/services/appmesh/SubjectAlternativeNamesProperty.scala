package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubjectAlternativeNamesProperty {

  def apply(
    `match`: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty.Builder)
      .`match`(`match`)
      .build()
}
