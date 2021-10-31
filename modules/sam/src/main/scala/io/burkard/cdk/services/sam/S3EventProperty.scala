package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
