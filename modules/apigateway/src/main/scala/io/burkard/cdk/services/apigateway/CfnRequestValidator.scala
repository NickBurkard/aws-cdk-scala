package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRequestValidator {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    validateRequestParameters: Option[Boolean] = None,
    validateRequestBody: Option[Boolean] = None,
    restApiId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnRequestValidator =
    software.amazon.awscdk.services.apigateway.CfnRequestValidator.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .validateRequestParameters(validateRequestParameters.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .validateRequestBody(validateRequestBody.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .restApiId(restApiId.orNull)
      .build()
}
