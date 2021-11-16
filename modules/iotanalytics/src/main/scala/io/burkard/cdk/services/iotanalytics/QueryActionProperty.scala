package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueryActionProperty {

  def apply(
    sqlQuery: String,
    filters: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.Builder)
      .sqlQuery(sqlQuery)
      .filters(filters.map(_.asJava).orNull)
      .build()
}
