package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRequestValidatorProps {

  def apply(
    name: Option[String] = None,
    validateRequestParameters: Option[Boolean] = None,
    validateRequestBody: Option[Boolean] = None,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps =
    (new software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps.Builder)
      .name(name.orNull)
      .validateRequestParameters(validateRequestParameters.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .validateRequestBody(validateRequestBody.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .restApiId(restApiId.orNull)
      .build()
}
