package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Behavior {

  def apply(
    forwardedValues: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty] = None,
    trustedKeyGroups: Option[List[_ <: software.amazon.awscdk.services.cloudfront.IKeyGroup]] = None,
    defaultTtl: Option[software.amazon.awscdk.Duration] = None,
    functionAssociations: Option[List[_ <: software.amazon.awscdk.services.cloudfront.FunctionAssociation]] = None,
    lambdaFunctionAssociations: Option[List[_ <: software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation]] = None,
    cachedMethods: Option[software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods] = None,
    trustedSigners: Option[List[String]] = None,
    allowedMethods: Option[software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods] = None,
    isDefaultBehavior: Option[Boolean] = None,
    pathPattern: Option[String] = None,
    viewerProtocolPolicy: Option[software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy] = None,
    maxTtl: Option[software.amazon.awscdk.Duration] = None,
    compress: Option[Boolean] = None,
    minTtl: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.cloudfront.Behavior =
    (new software.amazon.awscdk.services.cloudfront.Behavior.Builder)
      .forwardedValues(forwardedValues.orNull)
      .trustedKeyGroups(trustedKeyGroups.map(_.asJava).orNull)
      .defaultTtl(defaultTtl.orNull)
      .functionAssociations(functionAssociations.map(_.asJava).orNull)
      .lambdaFunctionAssociations(lambdaFunctionAssociations.map(_.asJava).orNull)
      .cachedMethods(cachedMethods.orNull)
      .trustedSigners(trustedSigners.map(_.asJava).orNull)
      .allowedMethods(allowedMethods.orNull)
      .isDefaultBehavior(isDefaultBehavior.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .pathPattern(pathPattern.orNull)
      .viewerProtocolPolicy(viewerProtocolPolicy.orNull)
      .maxTtl(maxTtl.orNull)
      .compress(compress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minTtl(minTtl.orNull)
      .build()
}
