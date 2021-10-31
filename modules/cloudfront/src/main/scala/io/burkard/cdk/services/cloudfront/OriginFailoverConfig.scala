package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginFailoverConfig {

  def apply(
    statusCodes: Option[List[_ <: Number]] = None,
    failoverOrigin: Option[software.amazon.awscdk.services.cloudfront.IOrigin] = None
  ): software.amazon.awscdk.services.cloudfront.OriginFailoverConfig =
    (new software.amazon.awscdk.services.cloudfront.OriginFailoverConfig.Builder)
      .statusCodes(statusCodes.map(_.asJava).orNull)
      .failoverOrigin(failoverOrigin.orNull)
      .build()
}
