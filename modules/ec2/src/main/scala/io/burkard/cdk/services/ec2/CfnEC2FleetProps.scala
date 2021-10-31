package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEC2FleetProps {

  def apply(
    tagSpecifications: Option[List[_]] = None,
    launchTemplateConfigs: Option[List[_]] = None,
    validUntil: Option[String] = None,
    context: Option[String] = None,
    validFrom: Option[String] = None,
    spotOptions: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty] = None,
    excessCapacityTerminationPolicy: Option[String] = None,
    replaceUnhealthyInstances: Option[Boolean] = None,
    onDemandOptions: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty] = None,
    targetCapacitySpecification: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty] = None,
    `type`: Option[String] = None,
    terminateInstancesWithExpiration: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2FleetProps =
    (new software.amazon.awscdk.services.ec2.CfnEC2FleetProps.Builder)
      .tagSpecifications(tagSpecifications.map(_.asJava).orNull)
      .launchTemplateConfigs(launchTemplateConfigs.map(_.asJava).orNull)
      .validUntil(validUntil.orNull)
      .context(context.orNull)
      .validFrom(validFrom.orNull)
      .spotOptions(spotOptions.orNull)
      .excessCapacityTerminationPolicy(excessCapacityTerminationPolicy.orNull)
      .replaceUnhealthyInstances(replaceUnhealthyInstances.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .onDemandOptions(onDemandOptions.orNull)
      .targetCapacitySpecification(targetCapacitySpecification.orNull)
      .`type`(`type`.orNull)
      .terminateInstancesWithExpiration(terminateInstancesWithExpiration.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
