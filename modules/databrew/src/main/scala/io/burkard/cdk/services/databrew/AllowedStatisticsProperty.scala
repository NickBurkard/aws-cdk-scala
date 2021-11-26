package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AllowedStatisticsProperty {

  def apply(
    statistics: List[String]
  ): software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty.Builder)
      .statistics(statistics.asJava)
      .build()
}
