package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceFleetConfigProperty {

  def apply(
    instanceFleetType: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType,
    instanceTypeConfigs: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty]] = None,
    launchSpecifications: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty] = None,
    targetSpotCapacity: Option[Number] = None,
    name: Option[String] = None,
    targetOnDemandCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty.Builder)
      .instanceFleetType(instanceFleetType)
      .instanceTypeConfigs(instanceTypeConfigs.map(_.asJava).orNull)
      .launchSpecifications(launchSpecifications.orNull)
      .targetSpotCapacity(targetSpotCapacity.orNull)
      .name(name.orNull)
      .targetOnDemandCapacity(targetOnDemandCapacity.orNull)
      .build()
}
