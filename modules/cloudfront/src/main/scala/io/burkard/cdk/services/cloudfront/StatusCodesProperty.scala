package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatusCodesProperty {

  def apply(
    quantity: Number,
    items: List[_ <: Number]
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty.Builder)
      .quantity(quantity)
      .items(items.asJava)
      .build()
}
