package io.burkard.cdk.services.iotanalytics

import scala.jdk.CollectionConverters._

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
