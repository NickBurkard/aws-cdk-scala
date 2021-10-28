package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DockerVolumeConfigurationProperty {

  def apply(
    scope: Option[String] = None,
    labels: Option[Map[String, String]] = None,
    driverOpts: Option[Map[String, String]] = None,
    autoprovision: Option[Boolean] = None,
    driver: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder)
      .scope(scope.orNull)
      .labels(labels.map(_.asJava).orNull)
      .driverOpts(driverOpts.map(_.asJava).orNull)
      .autoprovision(autoprovision.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .driver(driver.orNull)
      .build()
}
