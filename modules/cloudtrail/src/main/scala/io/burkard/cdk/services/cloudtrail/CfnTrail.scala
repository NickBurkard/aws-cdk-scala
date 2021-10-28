package io.burkard.cdk.services.cloudtrail

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTrail {

  def apply(
    internalResourceId: String,
    includeGlobalServiceEvents: Option[Boolean] = None,
    insightSelectors: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    isOrganizationTrail: Option[Boolean] = None,
    cloudWatchLogsLogGroupArn: Option[String] = None,
    s3BucketName: Option[String] = None,
    eventSelectors: Option[List[_]] = None,
    kmsKeyId: Option[String] = None,
    cloudWatchLogsRoleArn: Option[String] = None,
    isLogging: Option[Boolean] = None,
    s3KeyPrefix: Option[String] = None,
    isMultiRegionTrail: Option[Boolean] = None,
    enableLogFileValidation: Option[Boolean] = None,
    trailName: Option[String] = None,
    snsTopicName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudtrail.CfnTrail =
    software.amazon.awscdk.services.cloudtrail.CfnTrail.Builder
      .create(stackCtx, internalResourceId)
      .includeGlobalServiceEvents(includeGlobalServiceEvents.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .insightSelectors(insightSelectors.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .isOrganizationTrail(isOrganizationTrail.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn.orNull)
      .s3BucketName(s3BucketName.orNull)
      .eventSelectors(eventSelectors.map(_.asJava).orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .cloudWatchLogsRoleArn(cloudWatchLogsRoleArn.orNull)
      .isLogging(isLogging.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3KeyPrefix(s3KeyPrefix.orNull)
      .isMultiRegionTrail(isMultiRegionTrail.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enableLogFileValidation(enableLogFileValidation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .trailName(trailName.orNull)
      .snsTopicName(snsTopicName.orNull)
      .build()
}
