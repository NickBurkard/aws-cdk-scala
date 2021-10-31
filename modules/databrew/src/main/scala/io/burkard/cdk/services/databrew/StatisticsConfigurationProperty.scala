package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
