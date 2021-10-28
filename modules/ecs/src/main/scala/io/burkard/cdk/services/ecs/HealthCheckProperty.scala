package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HealthCheckProperty {

  def apply(
    retries: Option[Number] = None,
    command: Option[List[String]] = None,
    interval: Option[Number] = None,
    startPeriod: Option[Number] = None,
    timeout: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder)
      .retries(retries.orNull)
      .command(command.map(_.asJava).orNull)
      .interval(interval.orNull)
      .startPeriod(startPeriod.orNull)
      .timeout(timeout.orNull)
      .build()
}
