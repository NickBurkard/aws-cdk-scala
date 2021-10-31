package io.burkard.cdk.services.pinpoint

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SetDimensionProperty {

  def apply(
    dimensionType: Option[String] = None,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty.Builder)
      .dimensionType(dimensionType.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
