package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceAttributes {

  def apply(
    resourceId: String,
    path: String,
    restApi: software.amazon.awscdk.services.apigateway.IRestApi
  ): software.amazon.awscdk.services.apigateway.ResourceAttributes =
    (new software.amazon.awscdk.services.apigateway.ResourceAttributes.Builder)
      .resourceId(resourceId)
      .path(path)
      .restApi(restApi)
      .build()
}
