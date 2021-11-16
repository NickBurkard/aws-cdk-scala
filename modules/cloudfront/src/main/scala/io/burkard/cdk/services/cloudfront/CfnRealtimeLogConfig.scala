package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRealtimeLogConfig {

  def apply(
    internalResourceId: String,
    name: String,
    endPoints: List[_],
    samplingRate: Number,
    fields: List[String]
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig =
    software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .endPoints(endPoints.asJava)
      .samplingRate(samplingRate)
      .fields(fields.asJava)
      .build()
}
