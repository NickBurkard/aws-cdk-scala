package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDocumentationPart {

  def apply(
    internalResourceId: String,
    location: software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty,
    properties: String,
    restApiId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnDocumentationPart =
    software.amazon.awscdk.services.apigateway.CfnDocumentationPart.Builder
      .create(stackCtx, internalResourceId)
      .location(location)
      .properties(properties)
      .restApiId(restApiId)
      .build()
}
