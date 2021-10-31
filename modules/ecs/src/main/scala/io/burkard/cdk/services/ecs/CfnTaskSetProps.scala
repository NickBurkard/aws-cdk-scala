package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTaskSetProps {

  def apply(
    externalId: Option[String] = None,
    platformVersion: Option[String] = None,
    networkConfiguration: Option[software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty] = None,
    scale: Option[software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty] = None,
    launchType: Option[String] = None,
    cluster: Option[String] = None,
    taskDefinition: Option[String] = None,
    serviceRegistries: Option[List[_]] = None,
    service: Option[String] = None,
    loadBalancers: Option[List[_]] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskSetProps =
    (new software.amazon.awscdk.services.ecs.CfnTaskSetProps.Builder)
      .externalId(externalId.orNull)
      .platformVersion(platformVersion.orNull)
      .networkConfiguration(networkConfiguration.orNull)
      .scale(scale.orNull)
      .launchType(launchType.orNull)
      .cluster(cluster.orNull)
      .taskDefinition(taskDefinition.orNull)
      .serviceRegistries(serviceRegistries.map(_.asJava).orNull)
      .service(service.orNull)
      .loadBalancers(loadBalancers.map(_.asJava).orNull)
      .build()
}
