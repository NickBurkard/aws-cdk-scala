package io.burkard.cdk.core

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInclude {

  def apply(
    internalResourceId: String,
    template: com.fasterxml.jackson.databind.node.ObjectNode
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnInclude =
    software.amazon.awscdk.CfnInclude.Builder
      .create(stackCtx, internalResourceId)
      .template(template)
      .build()
}
