package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EcsEc2LaunchTargetOptions {

  def apply(
    placementConstraints: Option[List[_ <: software.amazon.awscdk.services.ecs.PlacementConstraint]] = None,
    placementStrategies: Option[List[_ <: software.amazon.awscdk.services.ecs.PlacementStrategy]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions.Builder)
      .placementConstraints(placementConstraints.map(_.asJava).orNull)
      .placementStrategies(placementStrategies.map(_.asJava).orNull)
      .build()
}
