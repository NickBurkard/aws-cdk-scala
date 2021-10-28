package io.burkard.cdk.services.gamelift

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGameSessionQueueProps {

  def apply(
    timeoutInSeconds: Option[Number] = None,
    name: Option[String] = None,
    customEventData: Option[String] = None,
    destinations: Option[List[_]] = None,
    priorityConfiguration: Option[software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty] = None,
    filterConfiguration: Option[software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty] = None,
    notificationTarget: Option[String] = None,
    playerLatencyPolicies: Option[List[_]] = None
  ): software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps =
    (new software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps.Builder)
      .timeoutInSeconds(timeoutInSeconds.orNull)
      .name(name.orNull)
      .customEventData(customEventData.orNull)
      .destinations(destinations.map(_.asJava).orNull)
      .priorityConfiguration(priorityConfiguration.orNull)
      .filterConfiguration(filterConfiguration.orNull)
      .notificationTarget(notificationTarget.orNull)
      .playerLatencyPolicies(playerLatencyPolicies.map(_.asJava).orNull)
      .build()
}
