package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUsagePlanProps {

  def apply(
    quota: Option[software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty] = None,
    usagePlanName: Option[String] = None,
    apiStages: Option[List[_]] = None,
    throttle: Option[software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.apigateway.CfnUsagePlanProps =
    (new software.amazon.awscdk.services.apigateway.CfnUsagePlanProps.Builder)
      .quota(quota.orNull)
      .usagePlanName(usagePlanName.orNull)
      .apiStages(apiStages.map(_.asJava).orNull)
      .throttle(throttle.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
