package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UsagePlanPerApiStage {

  def apply(
    stage: Option[software.amazon.awscdk.services.apigateway.Stage] = None,
    api: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None,
    throttle: Option[List[_ <: software.amazon.awscdk.services.apigateway.ThrottlingPerMethod]] = None
  ): software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage =
    (new software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage.Builder)
      .stage(stage.orNull)
      .api(api.orNull)
      .throttle(throttle.map(_.asJava).orNull)
      .build()
}
