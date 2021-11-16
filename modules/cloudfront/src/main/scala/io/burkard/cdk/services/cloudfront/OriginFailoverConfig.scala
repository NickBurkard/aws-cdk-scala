package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OriginFailoverConfig {

  def apply(
    failoverOrigin: software.amazon.awscdk.services.cloudfront.IOrigin,
    statusCodes: Option[List[_ <: Number]] = None
  ): software.amazon.awscdk.services.cloudfront.OriginFailoverConfig =
    (new software.amazon.awscdk.services.cloudfront.OriginFailoverConfig.Builder)
      .failoverOrigin(failoverOrigin)
      .statusCodes(statusCodes.map(_.asJava).orNull)
      .build()
}
