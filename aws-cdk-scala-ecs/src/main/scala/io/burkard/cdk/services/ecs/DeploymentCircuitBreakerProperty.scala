package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeploymentCircuitBreakerProperty {

  def apply(
    enable: Option[Boolean] = None,
    rollback: Option[Boolean] = None
  ): software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty =
    (new software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty.Builder)
      .enable(enable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .rollback(rollback.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
