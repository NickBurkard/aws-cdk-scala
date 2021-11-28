package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublicAccessBlockConfigurationProperty {

  def apply(
    blockPublicPolicy: Option[Boolean] = None,
    ignorePublicAcls: Option[Boolean] = None,
    blockPublicAcls: Option[Boolean] = None,
    restrictPublicBuckets: Option[Boolean] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder)
      .blockPublicPolicy(blockPublicPolicy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ignorePublicAcls(ignorePublicAcls.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .blockPublicAcls(blockPublicAcls.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .restrictPublicBuckets(restrictPublicBuckets.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
