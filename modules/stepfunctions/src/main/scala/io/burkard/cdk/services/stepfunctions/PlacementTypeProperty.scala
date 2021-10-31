package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PlacementTypeProperty {

  def apply(
    availabilityZone: Option[String] = None,
    availabilityZones: Option[List[String]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty.Builder)
      .availabilityZone(availabilityZone.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .build()
}
