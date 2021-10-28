package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNodegroup {

  def apply(
    internalResourceId: String,
    subnets: Option[List[String]] = None,
    diskSize: Option[Number] = None,
    tags: Option[AnyRef] = None,
    nodeRole: Option[String] = None,
    taints: Option[List[_]] = None,
    launchTemplate: Option[software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty] = None,
    version: Option[String] = None,
    scalingConfig: Option[software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty] = None,
    updateConfig: Option[software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty] = None,
    labels: Option[AnyRef] = None,
    amiType: Option[String] = None,
    releaseVersion: Option[String] = None,
    clusterName: Option[String] = None,
    capacityType: Option[String] = None,
    remoteAccess: Option[software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty] = None,
    nodegroupName: Option[String] = None,
    forceUpdateEnabled: Option[Boolean] = None,
    instanceTypes: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.CfnNodegroup =
    software.amazon.awscdk.services.eks.CfnNodegroup.Builder
      .create(stackCtx, internalResourceId)
      .subnets(subnets.map(_.asJava).orNull)
      .diskSize(diskSize.orNull)
      .tags(tags.orNull)
      .nodeRole(nodeRole.orNull)
      .taints(taints.map(_.asJava).orNull)
      .launchTemplate(launchTemplate.orNull)
      .version(version.orNull)
      .scalingConfig(scalingConfig.orNull)
      .updateConfig(updateConfig.orNull)
      .labels(labels.orNull)
      .amiType(amiType.orNull)
      .releaseVersion(releaseVersion.orNull)
      .clusterName(clusterName.orNull)
      .capacityType(capacityType.orNull)
      .remoteAccess(remoteAccess.orNull)
      .nodegroupName(nodegroupName.orNull)
      .forceUpdateEnabled(forceUpdateEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceTypes(instanceTypes.map(_.asJava).orNull)
      .build()
}
