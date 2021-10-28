package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApiStageProperty {

  def apply(
    stage: Option[String] = None,
    apiId: Option[String] = None,
    throttle: Option[Map[String, _]] = None
  ): software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty =
    (new software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty.Builder)
      .stage(stage.orNull)
      .apiId(apiId.orNull)
      .throttle(throttle.map(_.asJava).orNull)
      .build()
}
