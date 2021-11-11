package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RollingUpdateConfiguration {

  def apply(
    minSuccessfulInstancesPercent: Option[Number] = None,
    minInstancesInService: Option[Number] = None,
    pauseTime: Option[software.amazon.awscdk.Duration] = None,
    suspendProcesses: Option[List[_ <: software.amazon.awscdk.services.autoscaling.ScalingProcess]] = None,
    maxBatchSize: Option[Number] = None,
    waitOnResourceSignals: Option[Boolean] = None
  ): software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration =
    (new software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder)
      .minSuccessfulInstancesPercent(minSuccessfulInstancesPercent.orNull)
      .minInstancesInService(minInstancesInService.orNull)
      .pauseTime(pauseTime.orNull)
      .suspendProcesses(suspendProcesses.map(_.asJava).orNull)
      .maxBatchSize(maxBatchSize.orNull)
      .waitOnResourceSignals(waitOnResourceSignals.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
