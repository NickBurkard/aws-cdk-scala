package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3EventSource {

  def apply(
    bucket: software.amazon.awscdk.services.s3.Bucket,
    events: List[_ <: software.amazon.awscdk.services.s3.EventType],
    filters: Option[List[_ <: software.amazon.awscdk.services.s3.NotificationKeyFilter]] = None
  ): software.amazon.awscdk.services.lambda.eventsources.S3EventSource =
    software.amazon.awscdk.services.lambda.eventsources.S3EventSource.Builder
      .create(bucket)
      .events(events.asJava)
      .filters(filters.map(_.asJava).orNull)
      .build()
}
