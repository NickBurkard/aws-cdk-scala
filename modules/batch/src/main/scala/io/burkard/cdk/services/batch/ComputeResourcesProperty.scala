package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ComputeResourcesProperty {

  def apply(
    subnets: List[String],
    maxvCpus: Number,
    `type`: String,
    instanceRole: Option[String] = None,
    tags: Option[AnyRef] = None,
    launchTemplate: Option[software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty] = None,
    instanceTypes: Option[List[String]] = None,
    bidPercentage: Option[Number] = None,
    minvCpus: Option[Number] = None,
    imageId: Option[String] = None,
    ec2Configuration: Option[List[_]] = None,
    spotIamFleetRole: Option[String] = None,
    allocationStrategy: Option[String] = None,
    desiredvCpus: Option[Number] = None,
    ec2KeyPair: Option[String] = None,
    placementGroup: Option[String] = None,
    securityGroupIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty =
    (new software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder)
      .subnets(subnets.asJava)
      .maxvCpus(maxvCpus)
      .`type`(`type`)
      .instanceRole(instanceRole.orNull)
      .tags(tags.orNull)
      .launchTemplate(launchTemplate.orNull)
      .instanceTypes(instanceTypes.map(_.asJava).orNull)
      .bidPercentage(bidPercentage.orNull)
      .minvCpus(minvCpus.orNull)
      .imageId(imageId.orNull)
      .ec2Configuration(ec2Configuration.map(_.asJava).orNull)
      .spotIamFleetRole(spotIamFleetRole.orNull)
      .allocationStrategy(allocationStrategy.orNull)
      .desiredvCpus(desiredvCpus.orNull)
      .ec2KeyPair(ec2KeyPair.orNull)
      .placementGroup(placementGroup.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .build()
}
