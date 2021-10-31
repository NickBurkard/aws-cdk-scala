package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EcsParametersProperty {

  def apply(
    taskDefinitionArn: Option[String] = None,
    platformVersion: Option[String] = None,
    networkConfiguration: Option[software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty] = None,
    enableExecuteCommand: Option[Boolean] = None,
    tagList: Option[List[_]] = None,
    launchType: Option[String] = None,
    referenceId: Option[String] = None,
    group: Option[String] = None,
    taskCount: Option[Number] = None,
    capacityProviderStrategy: Option[List[_]] = None,
    propagateTags: Option[String] = None,
    enableEcsManagedTags: Option[Boolean] = None,
    placementConstraints: Option[List[_]] = None,
    placementStrategies: Option[List[_]] = None
  ): software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty =
    (new software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty.Builder)
      .taskDefinitionArn(taskDefinitionArn.orNull)
      .platformVersion(platformVersion.orNull)
      .networkConfiguration(networkConfiguration.orNull)
      .enableExecuteCommand(enableExecuteCommand.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tagList(tagList.map(_.asJava).orNull)
      .launchType(launchType.orNull)
      .referenceId(referenceId.orNull)
      .group(group.orNull)
      .taskCount(taskCount.orNull)
      .capacityProviderStrategy(capacityProviderStrategy.map(_.asJava).orNull)
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .placementConstraints(placementConstraints.map(_.asJava).orNull)
      .placementStrategies(placementStrategies.map(_.asJava).orNull)
      .build()
}
