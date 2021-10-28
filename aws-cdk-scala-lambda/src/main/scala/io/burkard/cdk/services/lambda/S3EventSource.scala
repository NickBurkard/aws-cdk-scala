package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3EventSource {

  def apply(
    bucket: software.amazon.awscdk.services.s3.Bucket,
    filters: Option[List[_ <: software.amazon.awscdk.services.s3.NotificationKeyFilter]] = None,
    events: Option[List[_ <: software.amazon.awscdk.services.s3.EventType]] = None
  ): software.amazon.awscdk.services.lambda.eventsources.S3EventSource =
    software.amazon.awscdk.services.lambda.eventsources.S3EventSource.Builder
      .create(bucket)
      .filters(filters.map(_.asJava).orNull)
      .events(events.map(_.asJava).orNull)
      .build()
}
