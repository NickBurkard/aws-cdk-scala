package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubjectAlternativeNamesProperty {

  def apply(
    `match`: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty.Builder)
      .`match`(`match`.orNull)
      .build()
}