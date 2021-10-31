package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TrustedSignersProperty {

  def apply(
    awsAccountNumbers: Option[List[String]] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty.Builder)
      .awsAccountNumbers(awsAccountNumbers.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
