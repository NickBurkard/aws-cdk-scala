package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3EventProperty {

  def apply(
    bucket: String,
    events0: List[String],
    events1: String,
    filter: Option[software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder)
      .bucket(bucket)
      .events(events0.asJava)
      .events(events1)
      .filter(filter.orNull)
      .build()
}
