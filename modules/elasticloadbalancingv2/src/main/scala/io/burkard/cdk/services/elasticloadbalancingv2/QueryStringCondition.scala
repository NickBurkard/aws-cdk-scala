package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueryStringCondition {

  def apply(
    value: String,
    key: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition.Builder)
      .value(value)
      .key(key.orNull)
      .build()
}
