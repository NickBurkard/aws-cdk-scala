package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EntityDetectorConfigurationProperty {

  def apply(
    entityTypes: List[String],
    allowedStatistics: Option[software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty.Builder)
      .entityTypes(entityTypes.asJava)
      .allowedStatistics(allowedStatistics.orNull)
      .build()
}
