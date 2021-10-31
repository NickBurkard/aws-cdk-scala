package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggingConfigurationProperty {

  def apply(
    includeExecutionData: Option[Boolean] = None,
    destinations: Option[List[_]] = None,
    level: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty.Builder)
      .includeExecutionData(includeExecutionData.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .destinations(destinations.map(_.asJava).orNull)
      .level(level.orNull)
      .build()
}
