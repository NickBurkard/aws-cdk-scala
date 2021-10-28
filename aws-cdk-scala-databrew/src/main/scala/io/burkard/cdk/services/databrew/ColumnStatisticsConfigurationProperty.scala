package io.burkard.cdk.services.databrew

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ColumnStatisticsConfigurationProperty {

  def apply(
    statistics: Option[software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty] = None,
    selectors: Option[List[_]] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty.Builder)
      .statistics(statistics.orNull)
      .selectors(selectors.map(_.asJava).orNull)
      .build()
}
