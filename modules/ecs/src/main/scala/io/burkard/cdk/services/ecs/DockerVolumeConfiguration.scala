package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DockerVolumeConfiguration {

  def apply(
    scope: software.amazon.awscdk.services.ecs.Scope,
    driver: String,
    labels: Option[Map[String, String]] = None,
    driverOpts: Option[Map[String, String]] = None,
    autoprovision: Option[Boolean] = None
  ): software.amazon.awscdk.services.ecs.DockerVolumeConfiguration =
    (new software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.Builder)
      .scope(scope)
      .driver(driver)
      .labels(labels.map(_.asJava).orNull)
      .driverOpts(driverOpts.map(_.asJava).orNull)
      .autoprovision(autoprovision.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
