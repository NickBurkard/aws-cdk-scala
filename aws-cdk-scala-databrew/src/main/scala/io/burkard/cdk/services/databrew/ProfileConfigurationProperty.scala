package io.burkard.cdk.services.databrew

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProfileConfigurationProperty {

  def apply(
    datasetStatisticsConfiguration: Option[software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty] = None,
    profileColumns: Option[List[_]] = None,
    columnStatisticsConfigurations: Option[List[_]] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty.Builder)
      .datasetStatisticsConfiguration(datasetStatisticsConfiguration.orNull)
      .profileColumns(profileColumns.map(_.asJava).orNull)
      .columnStatisticsConfigurations(columnStatisticsConfigurations.map(_.asJava).orNull)
      .build()
}
