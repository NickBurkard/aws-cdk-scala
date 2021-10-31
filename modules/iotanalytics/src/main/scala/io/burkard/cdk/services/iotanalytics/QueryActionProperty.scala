package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object QueryActionProperty {

  def apply(
    sqlQuery: Option[String] = None,
    filters: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.Builder)
      .sqlQuery(sqlQuery.orNull)
      .filters(filters.map(_.asJava).orNull)
      .build()
}
