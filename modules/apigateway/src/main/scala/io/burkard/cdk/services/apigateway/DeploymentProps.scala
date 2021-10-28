package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeploymentProps {

  def apply(
    description: Option[String] = None,
    retainDeployments: Option[Boolean] = None,
    api: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None
  ): software.amazon.awscdk.services.apigateway.DeploymentProps =
    (new software.amazon.awscdk.services.apigateway.DeploymentProps.Builder)
      .description(description.orNull)
      .retainDeployments(retainDeployments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .api(api.orNull)
      .build()
}
