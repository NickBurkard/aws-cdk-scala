package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginGroupsProperty {

  def apply(
    quantity: Option[Number] = None,
    items: Option[List[_]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty.Builder)
      .quantity(quantity.orNull)
      .items(items.map(_.asJava).orNull)
      .build()
}
