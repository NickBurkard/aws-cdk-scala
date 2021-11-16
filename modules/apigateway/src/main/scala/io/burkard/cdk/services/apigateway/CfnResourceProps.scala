package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceProps {

  def apply(
    pathPart: String,
    parentId: String,
    restApiId: String
  ): software.amazon.awscdk.services.apigateway.CfnResourceProps =
    (new software.amazon.awscdk.services.apigateway.CfnResourceProps.Builder)
      .pathPart(pathPart)
      .parentId(parentId)
      .restApiId(restApiId)
      .build()
}
