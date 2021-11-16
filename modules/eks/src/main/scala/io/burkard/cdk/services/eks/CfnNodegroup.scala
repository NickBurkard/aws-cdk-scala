package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNodegroup {

  def apply(
    internalResourceId: String,
    subnets: List[String],
    nodeRole: String,
    clusterName: String,
    diskSize: Option[Number] = None,
    tags: Option[AnyRef] = None,
    taints: Option[List[_]] = None,
    launchTemplate: Option[software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty] = None,
    version: Option[String] = None,
    scalingConfig: Option[software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty] = None,
    updateConfig: Option[software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty] = None,
    labels: Option[AnyRef] = None,
    amiType: Option[String] = None,
    releaseVersion: Option[String] = None,
    capacityType: Option[String] = None,
    remoteAccess: Option[software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty] = None,
    nodegroupName: Option[String] = None,
    forceUpdateEnabled: Option[Boolean] = None,
    instanceTypes: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.CfnNodegroup =
    software.amazon.awscdk.services.eks.CfnNodegroup.Builder
      .create(stackCtx, internalResourceId)
      .subnets(subnets.asJava)
      .nodeRole(nodeRole)
      .clusterName(clusterName)
      .diskSize(diskSize.orNull)
      .tags(tags.orNull)
      .taints(taints.map(_.asJava).orNull)
      .launchTemplate(launchTemplate.orNull)
      .version(version.orNull)
      .scalingConfig(scalingConfig.orNull)
      .updateConfig(updateConfig.orNull)
      .labels(labels.orNull)
      .amiType(amiType.orNull)
      .releaseVersion(releaseVersion.orNull)
      .capacityType(capacityType.orNull)
      .remoteAccess(remoteAccess.orNull)
      .nodegroupName(nodegroupName.orNull)
      .forceUpdateEnabled(forceUpdateEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceTypes(instanceTypes.map(_.asJava).orNull)
      .build()
}
