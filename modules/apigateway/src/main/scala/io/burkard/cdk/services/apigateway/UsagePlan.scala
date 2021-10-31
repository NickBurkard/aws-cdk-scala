package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UsagePlan {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    quota: Option[software.amazon.awscdk.services.apigateway.QuotaSettings] = None,
    description: Option[String] = None,
    apiStages: Option[List[_ <: software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage]] = None,
    throttle: Option[software.amazon.awscdk.services.apigateway.ThrottleSettings] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.UsagePlan =
    software.amazon.awscdk.services.apigateway.UsagePlan.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .quota(quota.orNull)
      .description(description.orNull)
      .apiStages(apiStages.map(_.asJava).orNull)
      .throttle(throttle.orNull)
      .build()
}
