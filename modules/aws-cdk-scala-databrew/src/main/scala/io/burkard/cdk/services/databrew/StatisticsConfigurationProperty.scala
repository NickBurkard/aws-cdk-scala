package io.burkard.cdk.services.databrew

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StatisticsConfigurationProperty {

  def apply(
    overrides: Option[List[_]] = None,
    includedStatistics: Option[List[String]] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty.Builder)
      .overrides(overrides.map(_.asJava).orNull)
      .includedStatistics(includedStatistics.map(_.asJava).orNull)
      .build()
}
