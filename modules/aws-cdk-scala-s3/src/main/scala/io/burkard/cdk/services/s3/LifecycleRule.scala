package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LifecycleRule {

  def apply(
    abortIncompleteMultipartUploadAfter: Option[software.amazon.awscdk.Duration] = None,
    tagFilters: Option[Map[String, _]] = None,
    expirationDate: Option[java.time.Instant] = None,
    noncurrentVersionExpiration: Option[software.amazon.awscdk.Duration] = None,
    expiration: Option[software.amazon.awscdk.Duration] = None,
    noncurrentVersionTransitions: Option[List[_ <: software.amazon.awscdk.services.s3.NoncurrentVersionTransition]] = None,
    prefix: Option[String] = None,
    expiredObjectDeleteMarker: Option[Boolean] = None,
    enabled: Option[Boolean] = None,
    transitions: Option[List[_ <: software.amazon.awscdk.services.s3.Transition]] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.s3.LifecycleRule =
    (new software.amazon.awscdk.services.s3.LifecycleRule.Builder)
      .abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter.orNull)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .expirationDate(expirationDate.orNull)
      .noncurrentVersionExpiration(noncurrentVersionExpiration.orNull)
      .expiration(expiration.orNull)
      .noncurrentVersionTransitions(noncurrentVersionTransitions.map(_.asJava).orNull)
      .prefix(prefix.orNull)
      .expiredObjectDeleteMarker(expiredObjectDeleteMarker.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .transitions(transitions.map(_.asJava).orNull)
      .id(id.orNull)
      .build()
}
