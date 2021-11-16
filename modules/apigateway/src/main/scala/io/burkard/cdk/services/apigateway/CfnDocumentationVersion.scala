package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDocumentationVersion {

  def apply(
    internalResourceId: String,
    documentationVersion: String,
    restApiId: String,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnDocumentationVersion =
    software.amazon.awscdk.services.apigateway.CfnDocumentationVersion.Builder
      .create(stackCtx, internalResourceId)
      .documentationVersion(documentationVersion)
      .restApiId(restApiId)
      .description(description.orNull)
      .build()
}
