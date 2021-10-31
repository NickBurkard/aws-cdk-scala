package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceAttributes {

  def apply(
    resourceId: Option[String] = None,
    path: Option[String] = None,
    restApi: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None
  ): software.amazon.awscdk.services.apigateway.ResourceAttributes =
    (new software.amazon.awscdk.services.apigateway.ResourceAttributes.Builder)
      .resourceId(resourceId.orNull)
      .path(path.orNull)
      .restApi(restApi.orNull)
      .build()
}
