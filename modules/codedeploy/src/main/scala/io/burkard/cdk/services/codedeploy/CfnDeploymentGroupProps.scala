package io.burkard.cdk.services.codedeploy

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeploymentGroupProps {

  def apply(
    alarmConfiguration: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty] = None,
    blueGreenDeploymentConfiguration: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty] = None,
    deployment: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty] = None,
    deploymentStyle: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty] = None,
    serviceRoleArn: Option[String] = None,
    onPremisesTagSet: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty] = None,
    ecsServices: Option[List[_]] = None,
    loadBalancerInfo: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty] = None,
    ec2TagSet: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty] = None,
    autoScalingGroups: Option[List[String]] = None,
    triggerConfigurations: Option[List[_]] = None,
    applicationName: Option[String] = None,
    deploymentConfigName: Option[String] = None,
    onPremisesInstanceTagFilters: Option[List[_]] = None,
    deploymentGroupName: Option[String] = None,
    ec2TagFilters: Option[List[_]] = None,
    autoRollbackConfiguration: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps.Builder)
      .alarmConfiguration(alarmConfiguration.orNull)
      .blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration.orNull)
      .deployment(deployment.orNull)
      .deploymentStyle(deploymentStyle.orNull)
      .serviceRoleArn(serviceRoleArn.orNull)
      .onPremisesTagSet(onPremisesTagSet.orNull)
      .ecsServices(ecsServices.map(_.asJava).orNull)
      .loadBalancerInfo(loadBalancerInfo.orNull)
      .ec2TagSet(ec2TagSet.orNull)
      .autoScalingGroups(autoScalingGroups.map(_.asJava).orNull)
      .triggerConfigurations(triggerConfigurations.map(_.asJava).orNull)
      .applicationName(applicationName.orNull)
      .deploymentConfigName(deploymentConfigName.orNull)
      .onPremisesInstanceTagFilters(onPremisesInstanceTagFilters.map(_.asJava).orNull)
      .deploymentGroupName(deploymentGroupName.orNull)
      .ec2TagFilters(ec2TagFilters.map(_.asJava).orNull)
      .autoRollbackConfiguration(autoRollbackConfiguration.orNull)
      .build()
}
