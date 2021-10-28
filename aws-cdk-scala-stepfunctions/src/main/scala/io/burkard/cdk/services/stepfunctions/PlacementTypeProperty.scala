package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

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
