package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OriginGroupProps {

  def apply(
    fallbackOrigin: software.amazon.awscdk.services.cloudfront.IOrigin,
    primaryOrigin: software.amazon.awscdk.services.cloudfront.IOrigin,
    fallbackStatusCodes: Option[List[_ <: Number]] = None
  ): software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps =
    (new software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps.Builder)
      .fallbackOrigin(fallbackOrigin)
      .primaryOrigin(primaryOrigin)
      .fallbackStatusCodes(fallbackStatusCodes.map(_.asJava).orNull)
      .build()
}
