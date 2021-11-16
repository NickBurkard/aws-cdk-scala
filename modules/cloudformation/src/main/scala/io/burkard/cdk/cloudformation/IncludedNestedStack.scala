package io.burkard.cdk.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IncludedNestedStack {

  def apply(
    includedTemplate: software.amazon.awscdk.cloudformation.include.CfnInclude,
    stack: software.amazon.awscdk.NestedStack
  ): software.amazon.awscdk.cloudformation.include.IncludedNestedStack =
    (new software.amazon.awscdk.cloudformation.include.IncludedNestedStack.Builder)
      .includedTemplate(includedTemplate)
      .stack(stack)
      .build()
}
