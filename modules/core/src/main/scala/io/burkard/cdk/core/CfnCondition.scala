package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCondition {

  def apply(
    internalResourceId: String,
    expression: Option[software.amazon.awscdk.ICfnConditionExpression] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnCondition =
    software.amazon.awscdk.CfnCondition.Builder
      .create(stackCtx, internalResourceId)
      .expression(expression.orNull)
      .build()
}
