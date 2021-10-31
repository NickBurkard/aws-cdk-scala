package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SkewedInfoProperty {

  def apply(
    skewedColumnNames: Option[List[String]] = None,
    skewedColumnValueLocationMaps: Option[AnyRef] = None,
    skewedColumnValues: Option[List[String]] = None
  ): software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty =
    (new software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty.Builder)
      .skewedColumnNames(skewedColumnNames.map(_.asJava).orNull)
      .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps.orNull)
      .skewedColumnValues(skewedColumnValues.map(_.asJava).orNull)
      .build()
}
