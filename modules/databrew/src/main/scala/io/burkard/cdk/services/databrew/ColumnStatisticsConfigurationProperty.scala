package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ColumnStatisticsConfigurationProperty {

  def apply(
    statistics: software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty,
    selectors: Option[List[_]] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty.Builder)
      .statistics(statistics)
      .selectors(selectors.map(_.asJava).orNull)
      .build()
}
