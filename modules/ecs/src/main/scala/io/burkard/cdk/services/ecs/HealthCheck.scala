package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HealthCheck {

  def apply(
    command: List[String],
    retries: Option[Number] = None,
    interval: Option[software.amazon.awscdk.Duration] = None,
    startPeriod: Option[software.amazon.awscdk.Duration] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.ecs.HealthCheck =
    (new software.amazon.awscdk.services.ecs.HealthCheck.Builder)
      .command(command.asJava)
      .retries(retries.orNull)
      .interval(interval.orNull)
      .startPeriod(startPeriod.orNull)
      .timeout(timeout.orNull)
      .build()
}
