package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GeoSpatialColumnGroupProperty {

  def apply(
    name: String,
    columns: List[String],
    countryCode: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty.Builder)
      .name(name)
      .columns(columns.asJava)
      .countryCode(countryCode.orNull)
      .build()
}
