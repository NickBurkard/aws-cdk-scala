package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoScalingGroupCapacityOptions {

  def apply(
    replacingUpdateMinSuccessfulInstancesPercent: Option[Number] = None,
    healthCheck: Option[software.amazon.awscdk.services.autoscaling.HealthCheck] = None,
    spotInterruptHandler: Option[Boolean] = None,
    signals: Option[software.amazon.awscdk.services.autoscaling.Signals] = None,
    machineImageType: Option[software.amazon.awscdk.services.eks.MachineImageType] = None,
    mapRole: Option[Boolean] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    allowAllOutbound: Option[Boolean] = None,
    desiredCapacity: Option[Number] = None,
    bootstrapEnabled: Option[Boolean] = None,
    maxCapacity: Option[Number] = None,
    blockDevices: Option[List[_ <: software.amazon.awscdk.services.autoscaling.BlockDevice]] = None,
    maxInstanceLifetime: Option[software.amazon.awscdk.Duration] = None,
    updateType: Option[software.amazon.awscdk.services.autoscaling.UpdateType] = None,
    ignoreUnmodifiedSizeProperties: Option[Boolean] = None,
    associatePublicIpAddress: Option[Boolean] = None,
    minCapacity: Option[Number] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    resourceSignalTimeout: Option[software.amazon.awscdk.Duration] = None,
    notificationsTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None,
    resourceSignalCount: Option[Number] = None,
    bootstrapOptions: Option[software.amazon.awscdk.services.eks.BootstrapOptions] = None,
    groupMetrics: Option[List[_ <: software.amazon.awscdk.services.autoscaling.GroupMetrics]] = None,
    keyName: Option[String] = None,
    newInstancesProtectedFromScaleIn: Option[Boolean] = None,
    instanceMonitoring: Option[software.amazon.awscdk.services.autoscaling.Monitoring] = None,
    spotPrice: Option[String] = None,
    notifications: Option[List[_ <: software.amazon.awscdk.services.autoscaling.NotificationConfiguration]] = None,
    autoScalingGroupName: Option[String] = None,
    rollingUpdateConfiguration: Option[software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration] = None,
    updatePolicy: Option[software.amazon.awscdk.services.autoscaling.UpdatePolicy] = None
  ): software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions =
    (new software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions.Builder)
      .replacingUpdateMinSuccessfulInstancesPercent(replacingUpdateMinSuccessfulInstancesPercent.orNull)
      .healthCheck(healthCheck.orNull)
      .spotInterruptHandler(spotInterruptHandler.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .signals(signals.orNull)
      .machineImageType(machineImageType.orNull)
      .mapRole(mapRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceType(instanceType.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .desiredCapacity(desiredCapacity.orNull)
      .bootstrapEnabled(bootstrapEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxCapacity(maxCapacity.orNull)
      .blockDevices(blockDevices.map(_.asJava).orNull)
      .maxInstanceLifetime(maxInstanceLifetime.orNull)
      .updateType(updateType.orNull)
      .ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .associatePublicIpAddress(associatePublicIpAddress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minCapacity(minCapacity.orNull)
      .cooldown(cooldown.orNull)
      .resourceSignalTimeout(resourceSignalTimeout.orNull)
      .notificationsTopic(notificationsTopic.orNull)
      .resourceSignalCount(resourceSignalCount.orNull)
      .bootstrapOptions(bootstrapOptions.orNull)
      .groupMetrics(groupMetrics.map(_.asJava).orNull)
      .keyName(keyName.orNull)
      .newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceMonitoring(instanceMonitoring.orNull)
      .spotPrice(spotPrice.orNull)
      .notifications(notifications.map(_.asJava).orNull)
      .autoScalingGroupName(autoScalingGroupName.orNull)
      .rollingUpdateConfiguration(rollingUpdateConfiguration.orNull)
      .updatePolicy(updatePolicy.orNull)
      .build()
}
