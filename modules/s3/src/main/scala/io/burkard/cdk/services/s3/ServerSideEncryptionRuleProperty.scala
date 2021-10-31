package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerSideEncryptionRuleProperty {

  def apply(
    serverSideEncryptionByDefault: Option[software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty] = None,
    bucketKeyEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty.Builder)
      .serverSideEncryptionByDefault(serverSideEncryptionByDefault.orNull)
      .bucketKeyEnabled(bucketKeyEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
