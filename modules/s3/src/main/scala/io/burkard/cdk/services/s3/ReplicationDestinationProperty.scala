package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicationDestinationProperty {

  def apply(
    bucket: String,
    encryptionConfiguration: Option[software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty] = None,
    storageClass: Option[String] = None,
    accessControlTranslation: Option[software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty] = None,
    replicationTime: Option[software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty] = None,
    metrics: Option[software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty] = None,
    account: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder)
      .bucket(bucket)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .storageClass(storageClass.orNull)
      .accessControlTranslation(accessControlTranslation.orNull)
      .replicationTime(replicationTime.orNull)
      .metrics(metrics.orNull)
      .account(account.orNull)
      .build()
}
