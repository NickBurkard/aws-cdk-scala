package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeploymentSourceContext {

  def apply(
    handlerRole: software.amazon.awscdk.services.iam.IRole
  ): software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext =
    (new software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext.Builder)
      .handlerRole(handlerRole)
      .build()
}
