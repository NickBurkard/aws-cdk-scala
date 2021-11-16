package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDistributionProps {

  def apply(
    distributionConfig: software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistributionProps =
    (new software.amazon.awscdk.services.cloudfront.CfnDistributionProps.Builder)
      .distributionConfig(distributionConfig)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
