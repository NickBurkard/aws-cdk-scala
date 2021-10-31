package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GeoSpatialColumnGroupProperty {

  def apply(
    name: Option[String] = None,
    countryCode: Option[String] = None,
    columns: Option[List[String]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty.Builder)
      .name(name.orNull)
      .countryCode(countryCode.orNull)
      .columns(columns.map(_.asJava).orNull)
      .build()
}
