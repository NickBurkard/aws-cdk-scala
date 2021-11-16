package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDocumentationPartProps {

  def apply(
    location: software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty,
    properties: String,
    restApiId: String
  ): software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps =
    (new software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps.Builder)
      .location(location)
      .properties(properties)
      .restApiId(restApiId)
      .build()
}
