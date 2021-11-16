package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDocumentationVersionProps {

  def apply(
    documentationVersion: String,
    restApiId: String,
    description: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps =
    (new software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps.Builder)
      .documentationVersion(documentationVersion)
      .restApiId(restApiId)
      .description(description.orNull)
      .build()
}
