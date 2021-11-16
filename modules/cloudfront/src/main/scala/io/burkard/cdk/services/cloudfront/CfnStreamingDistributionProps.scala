package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStreamingDistributionProps {

  def apply(
    tags: List[_ <: software.amazon.awscdk.CfnTag],
    streamingDistributionConfig: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty
  ): software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps =
    (new software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps.Builder)
      .tags(tags.asJava)
      .streamingDistributionConfig(streamingDistributionConfig)
      .build()
}
