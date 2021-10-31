package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RollingUpdateOptions {

  def apply(
    minInstancesInService: Option[Number] = None,
    minSuccessPercentage: Option[Number] = None,
    pauseTime: Option[software.amazon.awscdk.Duration] = None,
    suspendProcesses: Option[List[_ <: software.amazon.awscdk.services.autoscaling.ScalingProcess]] = None,
    maxBatchSize: Option[Number] = None,
    waitOnResourceSignals: Option[Boolean] = None
  ): software.amazon.awscdk.services.autoscaling.RollingUpdateOptions =
    (new software.amazon.awscdk.services.autoscaling.RollingUpdateOptions.Builder)
      .minInstancesInService(minInstancesInService.orNull)
      .minSuccessPercentage(minSuccessPercentage.orNull)
      .pauseTime(pauseTime.orNull)
      .suspendProcesses(suspendProcesses.map(_.asJava).orNull)
      .maxBatchSize(maxBatchSize.orNull)
      .waitOnResourceSignals(waitOnResourceSignals.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
