package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Deployment {

  def apply(
    internalResourceId: String,
    api: software.amazon.awscdk.services.apigateway.IRestApi,
    description: Option[String] = None,
    retainDeployments: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.Deployment =
    software.amazon.awscdk.services.apigateway.Deployment.Builder
      .create(stackCtx, internalResourceId)
      .api(api)
      .description(description.orNull)
      .retainDeployments(retainDeployments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
