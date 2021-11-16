package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CookiesProperty {

  def apply(
    forward: String,
    whitelistedNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty.Builder)
      .forward(forward)
      .whitelistedNames(whitelistedNames.map(_.asJava).orNull)
      .build()
}
