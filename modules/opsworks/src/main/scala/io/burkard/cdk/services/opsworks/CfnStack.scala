package io.burkard.cdk.services.opsworks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStack {

  def apply(
    internalResourceId: String,
    sourceStackId: Option[String] = None,
    defaultInstanceProfileArn: Option[String] = None,
    name: Option[String] = None,
    vpcId: Option[String] = None,
    serviceRoleArn: Option[String] = None,
    defaultRootDeviceType: Option[String] = None,
    attributes: Option[Map[String, String]] = None,
    customJson: Option[AnyRef] = None,
    clonePermissions: Option[Boolean] = None,
    defaultOs: Option[String] = None,
    defaultAvailabilityZone: Option[String] = None,
    useOpsworksSecurityGroups: Option[Boolean] = None,
    cloneAppIds: Option[List[String]] = None,
    defaultSshKeyName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    configurationManager: Option[software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty] = None,
    defaultSubnetId: Option[String] = None,
    customCookbooksSource: Option[software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty] = None,
    rdsDbInstances: Option[List[_]] = None,
    agentVersion: Option[String] = None,
    chefConfiguration: Option[software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty] = None,
    useCustomCookbooks: Option[Boolean] = None,
    ecsClusterArn: Option[String] = None,
    hostnameTheme: Option[String] = None,
    elasticIps: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.opsworks.CfnStack =
    software.amazon.awscdk.services.opsworks.CfnStack.Builder
      .create(stackCtx, internalResourceId)
      .sourceStackId(sourceStackId.orNull)
      .defaultInstanceProfileArn(defaultInstanceProfileArn.orNull)
      .name(name.orNull)
      .vpcId(vpcId.orNull)
      .serviceRoleArn(serviceRoleArn.orNull)
      .defaultRootDeviceType(defaultRootDeviceType.orNull)
      .attributes(attributes.map(_.asJava).orNull)
      .customJson(customJson.orNull)
      .clonePermissions(clonePermissions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultOs(defaultOs.orNull)
      .defaultAvailabilityZone(defaultAvailabilityZone.orNull)
      .useOpsworksSecurityGroups(useOpsworksSecurityGroups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloneAppIds(cloneAppIds.map(_.asJava).orNull)
      .defaultSshKeyName(defaultSshKeyName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .configurationManager(configurationManager.orNull)
      .defaultSubnetId(defaultSubnetId.orNull)
      .customCookbooksSource(customCookbooksSource.orNull)
      .rdsDbInstances(rdsDbInstances.map(_.asJava).orNull)
      .agentVersion(agentVersion.orNull)
      .chefConfiguration(chefConfiguration.orNull)
      .useCustomCookbooks(useCustomCookbooks.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ecsClusterArn(ecsClusterArn.orNull)
      .hostnameTheme(hostnameTheme.orNull)
      .elasticIps(elasticIps.map(_.asJava).orNull)
      .build()
}
