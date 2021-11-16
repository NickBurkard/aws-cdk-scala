package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeploymentProps {

  def apply(
    api: software.amazon.awscdk.services.apigateway.IRestApi,
    description: Option[String] = None,
    retainDeployments: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.DeploymentProps =
    (new software.amazon.awscdk.services.apigateway.DeploymentProps.Builder)
      .api(api)
      .description(description.orNull)
      .retainDeployments(retainDeployments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
