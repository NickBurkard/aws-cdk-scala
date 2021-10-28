package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkLoadBalancedEc2Service {

  def apply(
    internalResourceId: String,
    minHealthyPercent: Option[Number] = None,
    healthCheckGracePeriod: Option[software.amazon.awscdk.Duration] = None,
    desiredCount: Option[Number] = None,
    serviceName: Option[String] = None,
    circuitBreaker: Option[software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    cpu: Option[Number] = None,
    publicLoadBalancer: Option[Boolean] = None,
    recordType: Option[software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType] = None,
    memoryLimitMiB: Option[Number] = None,
    domainZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None,
    domainName: Option[String] = None,
    maxHealthyPercent: Option[Number] = None,
    propagateTags: Option[software.amazon.awscdk.services.ecs.PropagatedTagSource] = None,
    enableEcsManagedTags: Option[Boolean] = None,
    loadBalancer: Option[software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer] = None,
    taskImageOptions: Option[software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.Ec2TaskDefinition] = None,
    memoryReservationMiB: Option[Number] = None,
    deploymentController: Option[software.amazon.awscdk.services.ecs.DeploymentController] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    listenerPort: Option[Number] = None,
    cloudMapOptions: Option[software.amazon.awscdk.services.ecs.CloudMapOptions] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service =
    software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service.Builder
      .create(stackCtx, internalResourceId)
      .minHealthyPercent(minHealthyPercent.orNull)
      .healthCheckGracePeriod(healthCheckGracePeriod.orNull)
      .desiredCount(desiredCount.orNull)
      .serviceName(serviceName.orNull)
      .circuitBreaker(circuitBreaker.orNull)
      .cluster(cluster.orNull)
      .cpu(cpu.orNull)
      .publicLoadBalancer(publicLoadBalancer.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .recordType(recordType.orNull)
      .memoryLimitMiB(memoryLimitMiB.orNull)
      .domainZone(domainZone.orNull)
      .domainName(domainName.orNull)
      .maxHealthyPercent(maxHealthyPercent.orNull)
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loadBalancer(loadBalancer.orNull)
      .taskImageOptions(taskImageOptions.orNull)
      .taskDefinition(taskDefinition.orNull)
      .memoryReservationMiB(memoryReservationMiB.orNull)
      .deploymentController(deploymentController.orNull)
      .vpc(vpc.orNull)
      .listenerPort(listenerPort.orNull)
      .cloudMapOptions(cloudMapOptions.orNull)
      .build()
}
