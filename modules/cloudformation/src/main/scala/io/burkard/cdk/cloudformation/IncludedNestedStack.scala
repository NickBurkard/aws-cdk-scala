package io.burkard.cdk.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IncludedNestedStack {

  def apply(
    includedTemplate: Option[software.amazon.awscdk.cloudformation.include.CfnInclude] = None,
    stack: Option[software.amazon.awscdk.NestedStack] = None
  ): software.amazon.awscdk.cloudformation.include.IncludedNestedStack =
    (new software.amazon.awscdk.cloudformation.include.IncludedNestedStack.Builder)
      .includedTemplate(includedTemplate.orNull)
      .stack(stack.orNull)
      .build()
}
