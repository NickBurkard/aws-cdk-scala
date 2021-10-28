package io.burkard.cdk.services.sam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3EventProperty {

  def apply(
    filter: Option[software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty] = None,
    bucket: Option[String] = None,
    events0: Option[List[String]] = None,
    events1: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder)
      .filter(filter.orNull)
      .bucket(bucket.orNull)
      .events(events0.map(_.asJava).orNull)
      .events(events1.orNull)
      .build()
}
