package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkLoadBalancedServiceBaseProps {

  def apply(
    minHealthyPercent: Option[Number] = None,
    recordType: Option[software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType] = None,
    healthCheckGracePeriod: Option[software.amazon.awscdk.Duration] = None,
    desiredCount: Option[Number] = None,
    serviceName: Option[String] = None,
    circuitBreaker: Option[software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    publicLoadBalancer: Option[Boolean] = None,
    domainZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None,
    domainName: Option[String] = None,
    maxHealthyPercent: Option[Number] = None,
    propagateTags: Option[software.amazon.awscdk.services.ecs.PropagatedTagSource] = None,
    enableEcsManagedTags: Option[Boolean] = None,
    loadBalancer: Option[software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer] = None,
    taskImageOptions: Option[software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions] = None,
    deploymentController: Option[software.amazon.awscdk.services.ecs.DeploymentController] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    listenerPort: Option[Number] = None,
    cloudMapOptions: Option[software.amazon.awscdk.services.ecs.CloudMapOptions] = None
  ): software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBaseProps =
    (new software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBaseProps.Builder)
      .minHealthyPercent(minHealthyPercent.orNull)
      .recordType(recordType.orNull)
      .healthCheckGracePeriod(healthCheckGracePeriod.orNull)
      .desiredCount(desiredCount.orNull)
      .serviceName(serviceName.orNull)
      .circuitBreaker(circuitBreaker.orNull)
      .cluster(cluster.orNull)
      .publicLoadBalancer(publicLoadBalancer.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .domainZone(domainZone.orNull)
      .domainName(domainName.orNull)
      .maxHealthyPercent(maxHealthyPercent.orNull)
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loadBalancer(loadBalancer.orNull)
      .taskImageOptions(taskImageOptions.orNull)
      .deploymentController(deploymentController.orNull)
      .vpc(vpc.orNull)
      .listenerPort(listenerPort.orNull)
      .cloudMapOptions(cloudMapOptions.orNull)
      .build()
}
