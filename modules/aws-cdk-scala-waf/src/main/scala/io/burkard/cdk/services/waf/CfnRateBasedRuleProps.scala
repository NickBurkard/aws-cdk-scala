package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRateBasedRuleProps {

  def apply(
    matchPredicates: Option[List[_]] = None,
    name: Option[String] = None,
    rateKey: Option[String] = None,
    metricName: Option[String] = None,
    rateLimit: Option[Number] = None
  ): software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps =
    (new software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps.Builder)
      .matchPredicates(matchPredicates.map(_.asJava).orNull)
      .name(name.orNull)
      .rateKey(rateKey.orNull)
      .metricName(metricName.orNull)
      .rateLimit(rateLimit.orNull)
      .build()
}
