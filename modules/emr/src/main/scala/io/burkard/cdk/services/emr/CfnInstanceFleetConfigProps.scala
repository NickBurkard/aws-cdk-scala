package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstanceFleetConfigProps {

  def apply(
    clusterId: String,
    instanceFleetType: String,
    instanceTypeConfigs: Option[List[_]] = None,
    launchSpecifications: Option[software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty] = None,
    targetSpotCapacity: Option[Number] = None,
    name: Option[String] = None,
    targetOnDemandCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps =
    (new software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder)
      .clusterId(clusterId)
      .instanceFleetType(instanceFleetType)
      .instanceTypeConfigs(instanceTypeConfigs.map(_.asJava).orNull)
      .launchSpecifications(launchSpecifications.orNull)
      .targetSpotCapacity(targetSpotCapacity.orNull)
      .name(name.orNull)
      .targetOnDemandCapacity(targetOnDemandCapacity.orNull)
      .build()
}
