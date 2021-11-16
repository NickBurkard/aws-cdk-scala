package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstanceFleetConfig {

  def apply(
    internalResourceId: String,
    clusterId: String,
    instanceFleetType: String,
    instanceTypeConfigs: Option[List[_]] = None,
    launchSpecifications: Option[software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty] = None,
    targetSpotCapacity: Option[Number] = None,
    name: Option[String] = None,
    targetOnDemandCapacity: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig =
    software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.Builder
      .create(stackCtx, internalResourceId)
      .clusterId(clusterId)
      .instanceFleetType(instanceFleetType)
      .instanceTypeConfigs(instanceTypeConfigs.map(_.asJava).orNull)
      .launchSpecifications(launchSpecifications.orNull)
      .targetSpotCapacity(targetSpotCapacity.orNull)
      .name(name.orNull)
      .targetOnDemandCapacity(targetOnDemandCapacity.orNull)
      .build()
}
