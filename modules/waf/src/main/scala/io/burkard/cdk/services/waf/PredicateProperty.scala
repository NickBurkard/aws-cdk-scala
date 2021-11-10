package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PredicateProperty {

  def apply(
    dataId: Option[String] = None,
    `type`: Option[String] = None,
    negated: Option[Boolean] = None
  ): software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty =
    (new software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty.Builder)
      .dataId(dataId.orNull)
      .`type`(`type`.orNull)
      .negated(negated.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
