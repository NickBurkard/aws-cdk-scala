package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BucketAttributes {

  def apply(
    bucketDualStackDomainName: Option[String] = None,
    bucketWebsiteNewUrlFormat: Option[Boolean] = None,
    bucketDomainName: Option[String] = None,
    bucketRegionalDomainName: Option[String] = None,
    account: Option[String] = None,
    bucketArn: Option[String] = None,
    region: Option[String] = None,
    isWebsite: Option[Boolean] = None,
    bucketWebsiteUrl: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.s3.BucketAttributes =
    (new software.amazon.awscdk.services.s3.BucketAttributes.Builder)
      .bucketDualStackDomainName(bucketDualStackDomainName.orNull)
      .bucketWebsiteNewUrlFormat(bucketWebsiteNewUrlFormat.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .bucketDomainName(bucketDomainName.orNull)
      .bucketRegionalDomainName(bucketRegionalDomainName.orNull)
      .account(account.orNull)
      .bucketArn(bucketArn.orNull)
      .region(region.orNull)
      .isWebsite(isWebsite.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .bucketWebsiteUrl(bucketWebsiteUrl.orNull)
      .encryptionKey(encryptionKey.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
