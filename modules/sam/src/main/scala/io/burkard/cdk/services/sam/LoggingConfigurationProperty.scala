package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggingConfigurationProperty {

  def apply(
    includeExecutionData: Boolean,
    destinations: List[_],
    level: String
  ): software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty.Builder)
      .includeExecutionData(includeExecutionData)
      .destinations(destinations.asJava)
      .level(level)
      .build()
}
