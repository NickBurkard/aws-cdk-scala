package io.burkard.cdk.services.gamelift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGameSessionQueue {

  def apply(
    internalResourceId: String,
    timeoutInSeconds: Option[Number] = None,
    name: Option[String] = None,
    customEventData: Option[String] = None,
    destinations: Option[List[_]] = None,
    priorityConfiguration: Option[software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty] = None,
    filterConfiguration: Option[software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty] = None,
    notificationTarget: Option[String] = None,
    playerLatencyPolicies: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.gamelift.CfnGameSessionQueue =
    software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.Builder
      .create(stackCtx, internalResourceId)
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
