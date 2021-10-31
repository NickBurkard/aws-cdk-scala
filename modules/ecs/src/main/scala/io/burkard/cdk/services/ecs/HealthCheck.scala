package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HealthCheck {

  def apply(
    retries: Option[Number] = None,
    command: Option[List[String]] = None,
    interval: Option[software.amazon.awscdk.Duration] = None,
    startPeriod: Option[software.amazon.awscdk.Duration] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.ecs.HealthCheck =
    (new software.amazon.awscdk.services.ecs.HealthCheck.Builder)
      .retries(retries.orNull)
      .command(command.map(_.asJava).orNull)
      .interval(interval.orNull)
      .startPeriod(startPeriod.orNull)
      .timeout(timeout.orNull)
      .build()
}
