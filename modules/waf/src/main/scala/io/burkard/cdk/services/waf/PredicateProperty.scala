package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PredicateProperty {

  def apply(
    dataId: Option[String] = None,
    `type`: Option[String] = None,
    negated: Option[Boolean] = None
  ): software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty =
    (new software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder)
      .dataId(dataId.orNull)
      .`type`(`type`.orNull)
      .negated(negated.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
