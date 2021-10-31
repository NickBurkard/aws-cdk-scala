package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CommonAutoScalingGroupProps {

  def apply(
    healthCheck: Option[software.amazon.awscdk.services.autoscaling.HealthCheck] = None,
    signals: Option[software.amazon.awscdk.services.autoscaling.Signals] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    ignoreUnmodifiedSizeProperties: Option[Boolean] = None,
    allowAllOutbound: Option[Boolean] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    desiredCapacity: Option[Number] = None,
    updatePolicy: Option[software.amazon.awscdk.services.autoscaling.UpdatePolicy] = None,
    maxCapacity: Option[Number] = None,
    blockDevices: Option[List[_ <: software.amazon.awscdk.services.autoscaling.BlockDevice]] = None,
    maxInstanceLifetime: Option[software.amazon.awscdk.Duration] = None,
    associatePublicIpAddress: Option[Boolean] = None,
    minCapacity: Option[Number] = None,
    groupMetrics: Option[List[_ <: software.amazon.awscdk.services.autoscaling.GroupMetrics]] = None,
    keyName: Option[String] = None,
    newInstancesProtectedFromScaleIn: Option[Boolean] = None,
    instanceMonitoring: Option[software.amazon.awscdk.services.autoscaling.Monitoring] = None,
    spotPrice: Option[String] = None,
    notifications: Option[List[_ <: software.amazon.awscdk.services.autoscaling.NotificationConfiguration]] = None,
    autoScalingGroupName: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps =
    (new software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder)
      .healthCheck(healthCheck.orNull)
      .signals(signals.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cooldown(cooldown.orNull)
      .desiredCapacity(desiredCapacity.orNull)
      .updatePolicy(updatePolicy.orNull)
      .maxCapacity(maxCapacity.orNull)
      .blockDevices(blockDevices.map(_.asJava).orNull)
      .maxInstanceLifetime(maxInstanceLifetime.orNull)
      .associatePublicIpAddress(associatePublicIpAddress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minCapacity(minCapacity.orNull)
      .groupMetrics(groupMetrics.map(_.asJava).orNull)
      .keyName(keyName.orNull)
      .newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceMonitoring(instanceMonitoring.orNull)
      .spotPrice(spotPrice.orNull)
      .notifications(notifications.map(_.asJava).orNull)
      .autoScalingGroupName(autoScalingGroupName.orNull)
      .build()
}
