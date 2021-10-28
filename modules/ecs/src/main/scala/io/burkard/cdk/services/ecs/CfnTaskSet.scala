package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTaskSet {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.CfnTaskSet =
    software.amazon.awscdk.services.ecs.CfnTaskSet.Builder
      .create(stackCtx, internalResourceId)
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
