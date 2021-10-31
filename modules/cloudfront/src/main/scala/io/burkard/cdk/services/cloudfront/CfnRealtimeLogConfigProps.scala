package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRealtimeLogConfigProps {

  def apply(
    name: Option[String] = None,
    endPoints: Option[List[_]] = None,
    samplingRate: Option[Number] = None,
    fields: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps =
    (new software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps.Builder)
      .name(name.orNull)
      .endPoints(endPoints.map(_.asJava).orNull)
      .samplingRate(samplingRate.orNull)
      .fields(fields.map(_.asJava).orNull)
      .build()
}
