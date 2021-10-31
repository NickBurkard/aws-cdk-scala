package io.burkard.cdk.services.gamelift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PriorityConfigurationProperty {

  def apply(
    priorityOrder: Option[List[String]] = None,
    locationOrder: Option[List[String]] = None
  ): software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty =
    (new software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty.Builder)
      .priorityOrder(priorityOrder.map(_.asJava).orNull)
      .locationOrder(locationOrder.map(_.asJava).orNull)
      .build()
}
