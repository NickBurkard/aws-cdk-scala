package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAutoScalingGroup {

  def apply(
    internalResourceId: String,
    instanceId: Option[String] = None,
    terminationPolicies: Option[List[String]] = None,
    healthCheckGracePeriod: Option[Number] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty]] = None,
    lifecycleHookSpecificationList: Option[List[_]] = None,
    placementGroup: Option[String] = None,
    notificationConfigurations: Option[List[_]] = None,
    loadBalancerNames: Option[List[String]] = None,
    capacityRebalance: Option[Boolean] = None,
    cooldown: Option[String] = None,
    metricsCollection: Option[List[_]] = None,
    desiredCapacity: Option[String] = None,
    minSize: Option[String] = None,
    launchConfigurationName: Option[String] = None,
    serviceLinkedRoleArn: Option[String] = None,
    desiredCapacityType: Option[String] = None,
    maxInstanceLifetime: Option[Number] = None,
    context: Option[String] = None,
    mixedInstancesPolicy: Option[software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty] = None,
    healthCheckType: Option[String] = None,
    launchTemplate: Option[software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty] = None,
    vpcZoneIdentifier: Option[List[String]] = None,
    newInstancesProtectedFromScaleIn: Option[Boolean] = None,
    targetGroupArns: Option[List[String]] = None,
    maxSize: Option[String] = None,
    availabilityZones: Option[List[String]] = None,
    autoScalingGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup =
    software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.Builder
      .create(stackCtx, internalResourceId)
      .instanceId(instanceId.orNull)
      .terminationPolicies(terminationPolicies.map(_.asJava).orNull)
      .healthCheckGracePeriod(healthCheckGracePeriod.orNull)
      .tags(tags.map(_.asJava).orNull)
      .lifecycleHookSpecificationList(lifecycleHookSpecificationList.map(_.asJava).orNull)
      .placementGroup(placementGroup.orNull)
      .notificationConfigurations(notificationConfigurations.map(_.asJava).orNull)
      .loadBalancerNames(loadBalancerNames.map(_.asJava).orNull)
      .capacityRebalance(capacityRebalance.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cooldown(cooldown.orNull)
      .metricsCollection(metricsCollection.map(_.asJava).orNull)
      .desiredCapacity(desiredCapacity.orNull)
      .minSize(minSize.orNull)
      .launchConfigurationName(launchConfigurationName.orNull)
      .serviceLinkedRoleArn(serviceLinkedRoleArn.orNull)
      .desiredCapacityType(desiredCapacityType.orNull)
      .maxInstanceLifetime(maxInstanceLifetime.orNull)
      .context(context.orNull)
      .mixedInstancesPolicy(mixedInstancesPolicy.orNull)
      .healthCheckType(healthCheckType.orNull)
      .launchTemplate(launchTemplate.orNull)
      .vpcZoneIdentifier(vpcZoneIdentifier.map(_.asJava).orNull)
      .newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .targetGroupArns(targetGroupArns.map(_.asJava).orNull)
      .maxSize(maxSize.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .autoScalingGroupName(autoScalingGroupName.orNull)
      .build()
}
