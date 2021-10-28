package io.burkard.cdk.services.batch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ComputeResourcesProperty {

  def apply(
    subnets: Option[List[String]] = None,
    instanceRole: Option[String] = None,
    tags: Option[AnyRef] = None,
    launchTemplate: Option[software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty] = None,
    instanceTypes: Option[List[String]] = None,
    bidPercentage: Option[Number] = None,
    minvCpus: Option[Number] = None,
    imageId: Option[String] = None,
    ec2Configuration: Option[List[_]] = None,
    maxvCpus: Option[Number] = None,
    `type`: Option[String] = None,
    spotIamFleetRole: Option[String] = None,
    allocationStrategy: Option[String] = None,
    desiredvCpus: Option[Number] = None,
    ec2KeyPair: Option[String] = None,
    placementGroup: Option[String] = None,
    securityGroupIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty =
    (new software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder)
      .subnets(subnets.map(_.asJava).orNull)
      .instanceRole(instanceRole.orNull)
      .tags(tags.orNull)
      .launchTemplate(launchTemplate.orNull)
      .instanceTypes(instanceTypes.map(_.asJava).orNull)
      .bidPercentage(bidPercentage.orNull)
      .minvCpus(minvCpus.orNull)
      .imageId(imageId.orNull)
      .ec2Configuration(ec2Configuration.map(_.asJava).orNull)
      .maxvCpus(maxvCpus.orNull)
      .`type`(`type`.orNull)
      .spotIamFleetRole(spotIamFleetRole.orNull)
      .allocationStrategy(allocationStrategy.orNull)
      .desiredvCpus(desiredvCpus.orNull)
      .ec2KeyPair(ec2KeyPair.orNull)
      .placementGroup(placementGroup.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .build()
}
