package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBucket {

  def apply(
    internalResourceId: String,
    objectLockEnabled: Option[Boolean] = None,
    accelerateConfiguration: Option[software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty] = None,
    versioningConfiguration: Option[software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty] = None,
    bucketEncryption: Option[software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty] = None,
    notificationConfiguration: Option[software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty] = None,
    intelligentTieringConfigurations: Option[List[_]] = None,
    ownershipControls: Option[software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsProperty] = None,
    inventoryConfigurations: Option[List[_]] = None,
    websiteConfiguration: Option[software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty] = None,
    metricsConfigurations: Option[List[_]] = None,
    bucketName: Option[String] = None,
    publicAccessBlockConfiguration: Option[software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty] = None,
    loggingConfiguration: Option[software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty] = None,
    corsConfiguration: Option[software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty] = None,
    replicationConfiguration: Option[software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty] = None,
    analyticsConfigurations: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    accessControl: Option[String] = None,
    lifecycleConfiguration: Option[software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty] = None,
    objectLockConfiguration: Option[software.amazon.awscdk.services.s3.CfnBucket.ObjectLockConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3.CfnBucket =
    software.amazon.awscdk.services.s3.CfnBucket.Builder
      .create(stackCtx, internalResourceId)
      .objectLockEnabled(objectLockEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .accelerateConfiguration(accelerateConfiguration.orNull)
      .versioningConfiguration(versioningConfiguration.orNull)
      .bucketEncryption(bucketEncryption.orNull)
      .notificationConfiguration(notificationConfiguration.orNull)
      .intelligentTieringConfigurations(intelligentTieringConfigurations.map(_.asJava).orNull)
      .ownershipControls(ownershipControls.orNull)
      .inventoryConfigurations(inventoryConfigurations.map(_.asJava).orNull)
      .websiteConfiguration(websiteConfiguration.orNull)
      .metricsConfigurations(metricsConfigurations.map(_.asJava).orNull)
      .bucketName(bucketName.orNull)
      .publicAccessBlockConfiguration(publicAccessBlockConfiguration.orNull)
      .loggingConfiguration(loggingConfiguration.orNull)
      .corsConfiguration(corsConfiguration.orNull)
      .replicationConfiguration(replicationConfiguration.orNull)
      .analyticsConfigurations(analyticsConfigurations.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .accessControl(accessControl.orNull)
      .lifecycleConfiguration(lifecycleConfiguration.orNull)
      .objectLockConfiguration(objectLockConfiguration.orNull)
      .build()
}
