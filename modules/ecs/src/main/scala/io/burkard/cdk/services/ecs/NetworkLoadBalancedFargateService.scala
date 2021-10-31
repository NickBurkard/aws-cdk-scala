package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkLoadBalancedFargateService {

  def apply(
    internalResourceId: String,
    minHealthyPercent: Option[Number] = None,
    healthCheckGracePeriod: Option[software.amazon.awscdk.Duration] = None,
    platformVersion: Option[software.amazon.awscdk.services.ecs.FargatePlatformVersion] = None,
    desiredCount: Option[Number] = None,
    serviceName: Option[String] = None,
    circuitBreaker: Option[software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker] = None,
    cpu: Option[Number] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.FargateTaskDefinition] = None,
    publicLoadBalancer: Option[Boolean] = None,
    recordType: Option[software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType] = None,
    memoryLimitMiB: Option[Number] = None,
    domainZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None,
    domainName: Option[String] = None,
    maxHealthyPercent: Option[Number] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    assignPublicIp: Option[Boolean] = None,
    propagateTags: Option[software.amazon.awscdk.services.ecs.PropagatedTagSource] = None,
    enableEcsManagedTags: Option[Boolean] = None,
    loadBalancer: Option[software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer] = None,
    taskImageOptions: Option[software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions] = None,
    taskSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    deploymentController: Option[software.amazon.awscdk.services.ecs.DeploymentController] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    listenerPort: Option[Number] = None,
    cloudMapOptions: Option[software.amazon.awscdk.services.ecs.CloudMapOptions] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateService =
    software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateService.Builder
      .create(stackCtx, internalResourceId)
      .minHealthyPercent(minHealthyPercent.orNull)
      .healthCheckGracePeriod(healthCheckGracePeriod.orNull)
      .platformVersion(platformVersion.orNull)
      .desiredCount(desiredCount.orNull)
      .serviceName(serviceName.orNull)
      .circuitBreaker(circuitBreaker.orNull)
      .cpu(cpu.orNull)
      .taskDefinition(taskDefinition.orNull)
      .publicLoadBalancer(publicLoadBalancer.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .recordType(recordType.orNull)
      .memoryLimitMiB(memoryLimitMiB.orNull)
      .domainZone(domainZone.orNull)
      .domainName(domainName.orNull)
      .maxHealthyPercent(maxHealthyPercent.orNull)
      .cluster(cluster.orNull)
      .assignPublicIp(assignPublicIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loadBalancer(loadBalancer.orNull)
      .taskImageOptions(taskImageOptions.orNull)
      .taskSubnets(taskSubnets.orNull)
      .deploymentController(deploymentController.orNull)
      .vpc(vpc.orNull)
      .listenerPort(listenerPort.orNull)
      .cloudMapOptions(cloudMapOptions.orNull)
      .build()
}
