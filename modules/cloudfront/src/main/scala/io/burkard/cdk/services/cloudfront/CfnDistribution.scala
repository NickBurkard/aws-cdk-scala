package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDistribution {

  def apply(
    internalResourceId: String,
    distributionConfig: software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CfnDistribution =
    software.amazon.awscdk.services.cloudfront.CfnDistribution.Builder
      .create(stackCtx, internalResourceId)
      .distributionConfig(distributionConfig)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
