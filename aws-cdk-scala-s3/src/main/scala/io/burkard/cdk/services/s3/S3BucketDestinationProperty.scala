package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3BucketDestinationProperty {

  def apply(
    format: Option[String] = None,
    arn: Option[String] = None,
    outputSchemaVersion: Option[String] = None,
    prefix: Option[String] = None,
    accountId: Option[String] = None,
    encryption: Option[software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty.Builder)
      .format(format.orNull)
      .arn(arn.orNull)
      .outputSchemaVersion(outputSchemaVersion.orNull)
      .prefix(prefix.orNull)
      .accountId(accountId.orNull)
      .encryption(encryption.orNull)
      .build()
}
