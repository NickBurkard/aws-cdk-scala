package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConditionProps {

  def apply(
    expression: Option[software.amazon.awscdk.ICfnConditionExpression] = None
  ): software.amazon.awscdk.CfnConditionProps =
    (new software.amazon.awscdk.CfnConditionProps.Builder)
      .expression(expression.orNull)
      .build()
}
