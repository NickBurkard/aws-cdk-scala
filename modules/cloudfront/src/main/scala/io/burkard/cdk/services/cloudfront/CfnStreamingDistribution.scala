package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStreamingDistribution {

  def apply(
    internalResourceId: String,
    tags: List[_ <: software.amazon.awscdk.CfnTag],
    streamingDistributionConfig: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution =
    software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.asJava)
      .streamingDistributionConfig(streamingDistributionConfig)
      .build()
}
