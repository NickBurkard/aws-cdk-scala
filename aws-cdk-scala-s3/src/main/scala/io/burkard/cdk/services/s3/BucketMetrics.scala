package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BucketMetrics {

  def apply(
    tagFilters: Option[Map[String, _]] = None,
    prefix: Option[String] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.s3.BucketMetrics =
    (new software.amazon.awscdk.services.s3.BucketMetrics.Builder)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .prefix(prefix.orNull)
      .id(id.orNull)
      .build()
}
