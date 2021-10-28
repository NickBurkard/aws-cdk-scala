package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RequestValidatorOptions {

  def apply(
    validateRequestBody: Option[Boolean] = None,
    requestValidatorName: Option[String] = None,
    validateRequestParameters: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.RequestValidatorOptions =
    (new software.amazon.awscdk.services.apigateway.RequestValidatorOptions.Builder)
      .validateRequestBody(validateRequestBody.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requestValidatorName(requestValidatorName.orNull)
      .validateRequestParameters(validateRequestParameters.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
