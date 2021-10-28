package io.burkard.cdk.services.emr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceFleetConfigProperty {

  def apply(
    instanceTypeConfigs: Option[List[_]] = None,
    launchSpecifications: Option[software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty] = None,
    targetSpotCapacity: Option[Number] = None,
    name: Option[String] = None,
    targetOnDemandCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder)
      .instanceTypeConfigs(instanceTypeConfigs.map(_.asJava).orNull)
      .launchSpecifications(launchSpecifications.orNull)
      .targetSpotCapacity(targetSpotCapacity.orNull)
      .name(name.orNull)
      .targetOnDemandCapacity(targetOnDemandCapacity.orNull)
      .build()
}
