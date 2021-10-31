package io.burkard.cdk.services.pinpoint

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SegmentGroupsProperty {

  def apply(
    groups: Option[List[_]] = None,
    include: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty.Builder)
      .groups(groups.map(_.asJava).orNull)
      .include(include.orNull)
      .build()
}
