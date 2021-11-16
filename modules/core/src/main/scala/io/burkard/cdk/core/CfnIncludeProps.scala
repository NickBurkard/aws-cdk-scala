package io.burkard.cdk.core

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIncludeProps {

  def apply(
    template: com.fasterxml.jackson.databind.node.ObjectNode
  ): software.amazon.awscdk.CfnIncludeProps =
    (new software.amazon.awscdk.CfnIncludeProps.Builder)
      .template(template)
      .build()
}
