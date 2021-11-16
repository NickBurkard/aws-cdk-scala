package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TrustedSignersProperty {

  def apply(
    enabled: Boolean,
    awsAccountNumbers: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty.Builder)
      .enabled(enabled)
      .awsAccountNumbers(awsAccountNumbers.map(_.asJava).orNull)
      .build()
}
