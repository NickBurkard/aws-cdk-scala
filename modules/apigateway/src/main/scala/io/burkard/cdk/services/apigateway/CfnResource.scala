package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResource {

  def apply(
    internalResourceId: String,
    pathPart: Option[String] = None,
    parentId: Option[String] = None,
    restApiId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnResource =
    software.amazon.awscdk.services.apigateway.CfnResource.Builder
      .create(stackCtx, internalResourceId)
      .pathPart(pathPart.orNull)
      .parentId(parentId.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
