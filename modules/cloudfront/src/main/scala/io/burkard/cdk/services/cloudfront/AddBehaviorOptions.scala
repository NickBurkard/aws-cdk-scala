package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AddBehaviorOptions {

  def apply(
    originRequestPolicy: Option[software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy] = None,
    edgeLambdas: Option[List[_ <: software.amazon.awscdk.services.cloudfront.EdgeLambda]] = None,
    functionAssociations: Option[List[_ <: software.amazon.awscdk.services.cloudfront.FunctionAssociation]] = None,
    allowedMethods: Option[software.amazon.awscdk.services.cloudfront.AllowedMethods] = None,
    viewerProtocolPolicy: Option[software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy] = None,
    compress: Option[Boolean] = None,
    smoothStreaming: Option[Boolean] = None,
    cachedMethods: Option[software.amazon.awscdk.services.cloudfront.CachedMethods] = None,
    cachePolicy: Option[software.amazon.awscdk.services.cloudfront.ICachePolicy] = None,
    trustedKeyGroups: Option[List[_ <: software.amazon.awscdk.services.cloudfront.IKeyGroup]] = None
  ): software.amazon.awscdk.services.cloudfront.AddBehaviorOptions =
    (new software.amazon.awscdk.services.cloudfront.AddBehaviorOptions.Builder)
      .originRequestPolicy(originRequestPolicy.orNull)
      .edgeLambdas(edgeLambdas.map(_.asJava).orNull)
      .functionAssociations(functionAssociations.map(_.asJava).orNull)
      .allowedMethods(allowedMethods.orNull)
      .viewerProtocolPolicy(viewerProtocolPolicy.orNull)
      .compress(compress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .smoothStreaming(smoothStreaming.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cachedMethods(cachedMethods.orNull)
      .cachePolicy(cachePolicy.orNull)
      .trustedKeyGroups(trustedKeyGroups.map(_.asJava).orNull)
      .build()
}
