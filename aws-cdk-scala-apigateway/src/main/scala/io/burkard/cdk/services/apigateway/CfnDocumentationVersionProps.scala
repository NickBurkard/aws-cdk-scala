package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDocumentationVersionProps {

  def apply(
    description: Option[String] = None,
    documentationVersion: Option[String] = None,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps =
    (new software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps.Builder)
      .description(description.orNull)
      .documentationVersion(documentationVersion.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
