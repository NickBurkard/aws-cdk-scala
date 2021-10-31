package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStreamingDistribution {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    streamingDistributionConfig: Option[software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution =
    software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .streamingDistributionConfig(streamingDistributionConfig.orNull)
      .build()
}
