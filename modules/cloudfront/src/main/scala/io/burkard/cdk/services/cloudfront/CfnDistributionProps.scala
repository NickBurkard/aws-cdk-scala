package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDistributionProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    distributionConfig: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistributionProps =
    (new software.amazon.awscdk.services.cloudfront.CfnDistributionProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .distributionConfig(distributionConfig.orNull)
      .build()
}
