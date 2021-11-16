package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JsonWithStandardFieldProps {

  def apply(
    resourcePath: Boolean,
    ip: Boolean,
    requestTime: Boolean,
    httpMethod: Boolean,
    responseLength: Boolean,
    status: Boolean,
    user: Boolean,
    protocol: Boolean,
    caller: Boolean
  ): software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps =
    (new software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps.Builder)
      .resourcePath(resourcePath)
      .ip(ip)
      .requestTime(requestTime)
      .httpMethod(httpMethod)
      .responseLength(responseLength)
      .status(status)
      .user(user)
      .protocol(protocol)
      .caller(caller)
      .build()
}
