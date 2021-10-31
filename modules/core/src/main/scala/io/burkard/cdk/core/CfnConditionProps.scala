package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConditionProps {

  def apply(
    expression: Option[software.amazon.awscdk.ICfnConditionExpression] = None
  ): software.amazon.awscdk.CfnConditionProps =
    (new software.amazon.awscdk.CfnConditionProps.Builder)
      .expression(expression.orNull)
      .build()
}
