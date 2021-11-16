package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEC2Fleet {

  def apply(
    internalResourceId: String,
    launchTemplateConfigs: List[_],
    targetCapacitySpecification: software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty,
    tagSpecifications: Option[List[_]] = None,
    validUntil: Option[String] = None,
    context: Option[String] = None,
    validFrom: Option[String] = None,
    spotOptions: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty] = None,
    excessCapacityTerminationPolicy: Option[String] = None,
    replaceUnhealthyInstances: Option[Boolean] = None,
    onDemandOptions: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty] = None,
    `type`: Option[String] = None,
    terminateInstancesWithExpiration: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnEC2Fleet =
    software.amazon.awscdk.services.ec2.CfnEC2Fleet.Builder
      .create(stackCtx, internalResourceId)
      .launchTemplateConfigs(launchTemplateConfigs.asJava)
      .targetCapacitySpecification(targetCapacitySpecification)
      .tagSpecifications(tagSpecifications.map(_.asJava).orNull)
      .validUntil(validUntil.orNull)
      .context(context.orNull)
      .validFrom(validFrom.orNull)
      .spotOptions(spotOptions.orNull)
      .excessCapacityTerminationPolicy(excessCapacityTerminationPolicy.orNull)
      .replaceUnhealthyInstances(replaceUnhealthyInstances.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .onDemandOptions(onDemandOptions.orNull)
      .`type`(`type`.orNull)
      .terminateInstancesWithExpiration(terminateInstancesWithExpiration.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
