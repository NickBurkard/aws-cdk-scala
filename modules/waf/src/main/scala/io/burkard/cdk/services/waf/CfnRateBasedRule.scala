package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRateBasedRule {

  def apply(
    internalResourceId: String,
    matchPredicates: Option[List[_]] = None,
    name: Option[String] = None,
    rateKey: Option[String] = None,
    metricName: Option[String] = None,
    rateLimit: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnRateBasedRule =
    software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.Builder
      .create(stackCtx, internalResourceId)
      .matchPredicates(matchPredicates.map(_.asJava).orNull)
      .name(name.orNull)
      .rateKey(rateKey.orNull)
      .metricName(metricName.orNull)
      .rateLimit(rateLimit.orNull)
      .build()
}
