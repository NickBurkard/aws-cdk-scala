package io.burkard.cdk.services.cloudtrail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Trail {

  def apply(
    internalResourceId: String,
    enableFileValidation: Option[Boolean] = None,
    cloudWatchLogGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    snsTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    s3KeyPrefix: Option[String] = None,
    includeGlobalServiceEvents: Option[Boolean] = None,
    cloudWatchLogsRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    isMultiRegionTrail: Option[Boolean] = None,
    trailName: Option[String] = None,
    sendToCloudWatchLogs: Option[Boolean] = None,
    managementEvents: Option[software.amazon.awscdk.services.cloudtrail.ReadWriteType] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudtrail.Trail =
    software.amazon.awscdk.services.cloudtrail.Trail.Builder
      .create(stackCtx, internalResourceId)
      .enableFileValidation(enableFileValidation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudWatchLogGroup(cloudWatchLogGroup.orNull)
      .snsTopic(snsTopic.orNull)
      .bucket(bucket.orNull)
      .encryptionKey(encryptionKey.orNull)
      .s3KeyPrefix(s3KeyPrefix.orNull)
      .includeGlobalServiceEvents(includeGlobalServiceEvents.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudWatchLogsRetention(cloudWatchLogsRetention.orNull)
      .isMultiRegionTrail(isMultiRegionTrail.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .trailName(trailName.orNull)
      .sendToCloudWatchLogs(sendToCloudWatchLogs.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .managementEvents(managementEvents.orNull)
      .build()
}
