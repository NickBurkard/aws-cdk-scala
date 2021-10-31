package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UsagePlanProps {

  def apply(
    name: Option[String] = None,
    quota: Option[software.amazon.awscdk.services.apigateway.QuotaSettings] = None,
    description: Option[String] = None,
    apiStages: Option[List[_ <: software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage]] = None,
    throttle: Option[software.amazon.awscdk.services.apigateway.ThrottleSettings] = None
  ): software.amazon.awscdk.services.apigateway.UsagePlanProps =
    (new software.amazon.awscdk.services.apigateway.UsagePlanProps.Builder)
      .name(name.orNull)
      .quota(quota.orNull)
      .description(description.orNull)
      .apiStages(apiStages.map(_.asJava).orNull)
      .throttle(throttle.orNull)
      .build()
}
