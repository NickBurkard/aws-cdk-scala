package io.burkard.cdk.services.pinpoint

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AttributeDimensionProperty {

  def apply(
    values: Option[List[String]] = None,
    attributeType: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty.Builder)
      .values(values.map(_.asJava).orNull)
      .attributeType(attributeType.orNull)
      .build()
}
