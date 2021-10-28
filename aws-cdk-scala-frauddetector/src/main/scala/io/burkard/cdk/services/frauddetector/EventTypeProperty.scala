package io.burkard.cdk.services.frauddetector

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventTypeProperty {

  def apply(
    inline: Option[Boolean] = None,
    createdTime: Option[String] = None,
    labels: Option[List[_]] = None,
    entityTypes: Option[List[_]] = None,
    eventVariables: Option[List[_]] = None,
    arn: Option[String] = None,
    name: Option[String] = None,
    lastUpdatedTime: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty =
    (new software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty.Builder)
      .inline(inline.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .createdTime(createdTime.orNull)
      .labels(labels.map(_.asJava).orNull)
      .entityTypes(entityTypes.map(_.asJava).orNull)
      .eventVariables(eventVariables.map(_.asJava).orNull)
      .arn(arn.orNull)
      .name(name.orNull)
      .lastUpdatedTime(lastUpdatedTime.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
