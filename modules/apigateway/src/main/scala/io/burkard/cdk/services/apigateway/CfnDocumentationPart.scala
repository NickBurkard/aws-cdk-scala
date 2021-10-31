package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDocumentationPart {

  def apply(
    internalResourceId: String,
    location: Option[software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty] = None,
    properties: Option[String] = None,
    restApiId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnDocumentationPart =
    software.amazon.awscdk.services.apigateway.CfnDocumentationPart.Builder
      .create(stackCtx, internalResourceId)
      .location(location.orNull)
      .properties(properties.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
