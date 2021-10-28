package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginGroupProps {

  def apply(
    fallbackOrigin: Option[software.amazon.awscdk.services.cloudfront.IOrigin] = None,
    primaryOrigin: Option[software.amazon.awscdk.services.cloudfront.IOrigin] = None,
    fallbackStatusCodes: Option[List[_ <: Number]] = None
  ): software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps =
    (new software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps.Builder)
      .fallbackOrigin(fallbackOrigin.orNull)
      .primaryOrigin(primaryOrigin.orNull)
      .fallbackStatusCodes(fallbackStatusCodes.map(_.asJava).orNull)
      .build()
}
