package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStreamingDistributionProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    streamingDistributionConfig: Option[software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps =
    (new software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .streamingDistributionConfig(streamingDistributionConfig.orNull)
      .build()
}
