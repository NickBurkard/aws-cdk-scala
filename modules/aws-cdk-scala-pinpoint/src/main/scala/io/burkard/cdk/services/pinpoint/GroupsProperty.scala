package io.burkard.cdk.services.pinpoint

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GroupsProperty {

  def apply(
    sourceType: Option[String] = None,
    sourceSegments: Option[List[_]] = None,
    dimensions: Option[List[_]] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty.Builder)
      .sourceType(sourceType.orNull)
      .sourceSegments(sourceSegments.map(_.asJava).orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
