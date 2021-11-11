package io.burkard.cdk.core

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIncludeProps {

  def apply(
    template: Option[com.fasterxml.jackson.databind.node.ObjectNode] = None
  ): software.amazon.awscdk.CfnIncludeProps =
    (new software.amazon.awscdk.CfnIncludeProps.Builder)
      .template(template.orNull)
      .build()
}
