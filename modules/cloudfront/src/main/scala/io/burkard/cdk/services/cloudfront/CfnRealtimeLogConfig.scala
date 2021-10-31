package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRealtimeLogConfig {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    endPoints: Option[List[_]] = None,
    samplingRate: Option[Number] = None,
    fields: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig =
    software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .endPoints(endPoints.map(_.asJava).orNull)
      .samplingRate(samplingRate.orNull)
      .fields(fields.map(_.asJava).orNull)
      .build()
}
