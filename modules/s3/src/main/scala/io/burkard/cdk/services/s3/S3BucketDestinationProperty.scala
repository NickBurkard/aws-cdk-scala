package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3BucketDestinationProperty {

  def apply(
    format: String,
    arn: String,
    outputSchemaVersion: String,
    accountId: String,
    prefix: Option[String] = None,
    encryption: Option[software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty.Builder)
      .format(format)
      .arn(arn)
      .outputSchemaVersion(outputSchemaVersion)
      .accountId(accountId)
      .prefix(prefix.orNull)
      .encryption(encryption.orNull)
      .build()
}
