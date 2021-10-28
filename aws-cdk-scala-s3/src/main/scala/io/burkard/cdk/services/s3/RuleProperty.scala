package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuleProperty {

  def apply(
    tagFilters: Option[List[_]] = None,
    expirationDate: Option[java.time.Instant] = None,
    expiredObjectDeleteMarker: Option[Boolean] = None,
    abortIncompleteMultipartUpload: Option[software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty] = None,
    transition: Option[software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty] = None,
    noncurrentVersionTransition: Option[software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty] = None,
    noncurrentVersionTransitions: Option[List[_]] = None,
    prefix: Option[String] = None,
    expirationInDays: Option[Number] = None,
    transitions: Option[List[_]] = None,
    id: Option[String] = None,
    status: Option[String] = None,
    noncurrentVersionExpirationInDays: Option[Number] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.RuleProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .expirationDate(expirationDate.orNull)
      .expiredObjectDeleteMarker(expiredObjectDeleteMarker.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.orNull)
      .transition(transition.orNull)
      .noncurrentVersionTransition(noncurrentVersionTransition.orNull)
      .noncurrentVersionTransitions(noncurrentVersionTransitions.map(_.asJava).orNull)
      .prefix(prefix.orNull)
      .expirationInDays(expirationInDays.orNull)
      .transitions(transitions.map(_.asJava).orNull)
      .id(id.orNull)
      .status(status.orNull)
      .noncurrentVersionExpirationInDays(noncurrentVersionExpirationInDays.orNull)
      .build()
}
