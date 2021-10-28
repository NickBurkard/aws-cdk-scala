package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StatusCodesProperty {

  def apply(
    quantity: Option[Number] = None,
    items: Option[List[_ <: Number]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty.Builder)
      .quantity(quantity.orNull)
      .items(items.map(_.asJava).orNull)
      .build()
}
