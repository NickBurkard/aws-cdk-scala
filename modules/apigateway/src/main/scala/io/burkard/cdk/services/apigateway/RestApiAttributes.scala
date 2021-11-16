package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RestApiAttributes {

  def apply(
    rootResourceId: String,
    restApiId: String
  ): software.amazon.awscdk.services.apigateway.RestApiAttributes =
    (new software.amazon.awscdk.services.apigateway.RestApiAttributes.Builder)
      .rootResourceId(rootResourceId)
      .restApiId(restApiId)
      .build()
}
