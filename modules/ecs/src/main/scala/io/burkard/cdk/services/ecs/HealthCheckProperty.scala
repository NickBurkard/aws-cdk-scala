package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
