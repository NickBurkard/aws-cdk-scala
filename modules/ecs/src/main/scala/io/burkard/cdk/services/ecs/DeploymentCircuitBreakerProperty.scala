package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeploymentCircuitBreakerProperty {

  def apply(
    enable: Boolean,
    rollback: Boolean
  ): software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty =
    (new software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty.Builder)
      .enable(enable)
      .rollback(rollback)
      .build()
}
