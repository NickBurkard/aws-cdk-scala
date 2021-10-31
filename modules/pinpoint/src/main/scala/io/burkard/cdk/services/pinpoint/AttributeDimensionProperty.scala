package io.burkard.cdk.services.pinpoint

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AttributeDimensionProperty {

  def apply(
    values: Option[List[String]] = None,
    attributeType: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty.Builder)
      .values(values.map(_.asJava).orNull)
      .attributeType(attributeType.orNull)
      .build()
}
