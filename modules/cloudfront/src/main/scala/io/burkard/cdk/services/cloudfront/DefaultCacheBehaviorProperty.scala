package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DefaultCacheBehaviorProperty {

  def apply(
    forwardedValues: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty] = None,
    defaultTtl: Option[Number] = None,
    functionAssociations: Option[List[_]] = None,
    lambdaFunctionAssociations: Option[List[_]] = None,
    smoothStreaming: Option[Boolean] = None,
    cachedMethods: Option[List[String]] = None,
    trustedSigners: Option[List[String]] = None,
    fieldLevelEncryptionId: Option[String] = None,
    trustedKeyGroups: Option[List[String]] = None,
    cachePolicyId: Option[String] = None,
    realtimeLogConfigArn: Option[String] = None,
    allowedMethods: Option[List[String]] = None,
    targetOriginId: Option[String] = None,
    viewerProtocolPolicy: Option[String] = None,
    maxTtl: Option[Number] = None,
    originRequestPolicyId: Option[String] = None,
    compress: Option[Boolean] = None,
    minTtl: Option[Number] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder)
      .forwardedValues(forwardedValues.orNull)
      .defaultTtl(defaultTtl.orNull)
      .functionAssociations(functionAssociations.map(_.asJava).orNull)
      .lambdaFunctionAssociations(lambdaFunctionAssociations.map(_.asJava).orNull)
      .smoothStreaming(smoothStreaming.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cachedMethods(cachedMethods.map(_.asJava).orNull)
      .trustedSigners(trustedSigners.map(_.asJava).orNull)
      .fieldLevelEncryptionId(fieldLevelEncryptionId.orNull)
      .trustedKeyGroups(trustedKeyGroups.map(_.asJava).orNull)
      .cachePolicyId(cachePolicyId.orNull)
      .realtimeLogConfigArn(realtimeLogConfigArn.orNull)
      .allowedMethods(allowedMethods.map(_.asJava).orNull)
      .targetOriginId(targetOriginId.orNull)
      .viewerProtocolPolicy(viewerProtocolPolicy.orNull)
      .maxTtl(maxTtl.orNull)
      .originRequestPolicyId(originRequestPolicyId.orNull)
      .compress(compress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minTtl(minTtl.orNull)
      .build()
}
