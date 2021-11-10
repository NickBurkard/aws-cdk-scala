package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancerProperty {

  def apply(
    containerName: Option[String] = None,
    loadBalancerName: Option[String] = None,
    targetGroupArn: Option[String] = None,
    containerPort: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty =
    (new software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder)
      .containerName(containerName.orNull)
      .loadBalancerName(loadBalancerName.orNull)
      .targetGroupArn(targetGroupArn.orNull)
      .containerPort(containerPort.orNull)
      .build()
}
