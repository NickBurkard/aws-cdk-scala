package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRateBasedRuleProps {

  def apply(
    name: String,
    rateKey: String,
    metricName: String,
    rateLimit: Number,
    matchPredicates: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps =
    (new software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps.Builder)
      .name(name)
      .rateKey(rateKey)
      .metricName(metricName)
      .rateLimit(rateLimit)
      .matchPredicates(matchPredicates.map(_.asJava).orNull)
      .build()
}
