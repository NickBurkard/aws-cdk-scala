package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRequestValidatorProps {

  def apply(
    restApiId: String,
    name: Option[String] = None,
    validateRequestParameters: Option[Boolean] = None,
    validateRequestBody: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps =
    (new software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps.Builder)
      .restApiId(restApiId)
      .name(name.orNull)
      .validateRequestParameters(validateRequestParameters.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .validateRequestBody(validateRequestBody.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
