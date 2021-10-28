package io.burkard.cdk.services.pinpoint

import scala.jdk.CollectionConverters._

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
