package io.burkard.cdk.services.frauddetector

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LabelProperty {

  def apply(
    arn: Option[String] = None,
    inline: Option[Boolean] = None,
    createdTime: Option[String] = None,
    name: Option[String] = None,
    lastUpdatedTime: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty =
    (new software.amazon.awscdk.services.frauddetector.CfnEventType.LabelProperty.Builder)
      .arn(arn.orNull)
      .inline(inline.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .createdTime(createdTime.orNull)
      .name(name.orNull)
      .lastUpdatedTime(lastUpdatedTime.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
