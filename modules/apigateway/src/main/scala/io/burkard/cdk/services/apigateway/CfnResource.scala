package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResource {

  def apply(
    internalResourceId: String,
    pathPart: String,
    parentId: String,
    restApiId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnResource =
    software.amazon.awscdk.services.apigateway.CfnResource.Builder
      .create(stackCtx, internalResourceId)
      .pathPart(pathPart)
      .parentId(parentId)
      .restApiId(restApiId)
      .build()
}
