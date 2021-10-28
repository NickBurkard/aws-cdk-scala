package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CookiesProperty {

  def apply(
    forward: Option[String] = None,
    whitelistedNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty.Builder)
      .forward(forward.orNull)
      .whitelistedNames(whitelistedNames.map(_.asJava).orNull)
      .build()
}