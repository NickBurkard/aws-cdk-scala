package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoScalingGroupProps {

  def apply(
    instanceType: software.amazon.awscdk.services.ec2.InstanceType,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    machineImage: software.amazon.awscdk.services.ec2.IMachineImage,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    signals: Option[software.amazon.awscdk.services.autoscaling.Signals] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    ignoreUnmodifiedSizeProperties: Option[Boolean] = None,
    allowAllOutbound: Option[Boolean] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    requireImdsv2: Option[Boolean] = None,
    desiredCapacity: Option[Number] = None,
    updatePolicy: Option[software.amazon.awscdk.services.autoscaling.UpdatePolicy] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    initOptions: Option[software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions] = None,
    healthCheck: Option[software.amazon.awscdk.services.autoscaling.HealthCheck] = None,
    maxCapacity: Option[Number] = None,
    blockDevices: Option[List[_ <: software.amazon.awscdk.services.autoscaling.BlockDevice]] = None,
    maxInstanceLifetime: Option[software.amazon.awscdk.Duration] = None,
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None,
    associatePublicIpAddress: Option[Boolean] = None,
    minCapacity: Option[Number] = None,
    groupMetrics: Option[List[_ <: software.amazon.awscdk.services.autoscaling.GroupMetrics]] = None,
    keyName: Option[String] = None,
    newInstancesProtectedFromScaleIn: Option[Boolean] = None,
    instanceMonitoring: Option[software.amazon.awscdk.services.autoscaling.Monitoring] = None,
    spotPrice: Option[String] = None,
    notifications: Option[List[_ <: software.amazon.awscdk.services.autoscaling.NotificationConfiguration]] = None,
    autoScalingGroupName: Option[String] = None,
    init: Option[software.amazon.awscdk.services.ec2.CloudFormationInit] = None
  ): software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps =
    (new software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder)
      .instanceType(instanceType)
      .vpc(vpc)
      .machineImage(machineImage)
      .role(role.orNull)
      .signals(signals.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cooldown(cooldown.orNull)
      .requireImdsv2(requireImdsv2.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .desiredCapacity(desiredCapacity.orNull)
      .updatePolicy(updatePolicy.orNull)
      .securityGroup(securityGroup.orNull)
      .initOptions(initOptions.orNull)
      .healthCheck(healthCheck.orNull)
      .maxCapacity(maxCapacity.orNull)
      .blockDevices(blockDevices.map(_.asJava).orNull)
      .maxInstanceLifetime(maxInstanceLifetime.orNull)
      .userData(userData.orNull)
      .associatePublicIpAddress(associatePublicIpAddress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minCapacity(minCapacity.orNull)
      .groupMetrics(groupMetrics.map(_.asJava).orNull)
      .keyName(keyName.orNull)
      .newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceMonitoring(instanceMonitoring.orNull)
      .spotPrice(spotPrice.orNull)
      .notifications(notifications.map(_.asJava).orNull)
      .autoScalingGroupName(autoScalingGroupName.orNull)
      .init(init.orNull)
      .build()
}
