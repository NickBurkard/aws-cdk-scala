package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RequestValidatorProps {

  def apply(
    restApi: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None,
    validateRequestBody: Option[Boolean] = None,
    requestValidatorName: Option[String] = None,
    validateRequestParameters: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.RequestValidatorProps =
    (new software.amazon.awscdk.services.apigateway.RequestValidatorProps.Builder)
      .restApi(restApi.orNull)
      .validateRequestBody(validateRequestBody.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requestValidatorName(requestValidatorName.orNull)
      .validateRequestParameters(validateRequestParameters.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
