package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTaskSetProps {

  def apply(
    cluster: String,
    taskDefinition: String,
    service: String,
    externalId: Option[String] = None,
    platformVersion: Option[String] = None,
    networkConfiguration: Option[software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty] = None,
    scale: Option[software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty] = None,
    launchType: Option[String] = None,
    serviceRegistries: Option[List[_]] = None,
    loadBalancers: Option[List[_]] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskSetProps =
    (new software.amazon.awscdk.services.ecs.CfnTaskSetProps.Builder)
      .cluster(cluster)
      .taskDefinition(taskDefinition)
      .service(service)
      .externalId(externalId.orNull)
      .platformVersion(platformVersion.orNull)
      .networkConfiguration(networkConfiguration.orNull)
      .scale(scale.orNull)
      .launchType(launchType.orNull)
      .serviceRegistries(serviceRegistries.map(_.asJava).orNull)
      .loadBalancers(loadBalancers.map(_.asJava).orNull)
      .build()
}
