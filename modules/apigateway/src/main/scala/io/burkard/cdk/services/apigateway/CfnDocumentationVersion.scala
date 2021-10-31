package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDocumentationVersion {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    documentationVersion: Option[String] = None,
    restApiId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnDocumentationVersion =
    software.amazon.awscdk.services.apigateway.CfnDocumentationVersion.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .documentationVersion(documentationVersion.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
