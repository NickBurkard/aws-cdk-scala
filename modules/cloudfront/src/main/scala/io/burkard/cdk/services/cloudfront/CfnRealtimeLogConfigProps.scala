package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRealtimeLogConfigProps {

  def apply(
    name: String,
    endPoints: List[_],
    samplingRate: Number,
    fields: List[String]
  ): software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps =
    (new software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps.Builder)
      .name(name)
      .endPoints(endPoints.asJava)
      .samplingRate(samplingRate)
      .fields(fields.asJava)
      .build()
}
