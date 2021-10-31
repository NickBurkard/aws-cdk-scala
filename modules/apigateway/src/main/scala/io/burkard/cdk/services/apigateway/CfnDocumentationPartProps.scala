package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDocumentationPartProps {

  def apply(
    location: Option[software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty] = None,
    properties: Option[String] = None,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps =
    (new software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps.Builder)
      .location(location.orNull)
      .properties(properties.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
