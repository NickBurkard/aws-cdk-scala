package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JsonWithStandardFieldProps {

  def apply(
    resourcePath: Option[Boolean] = None,
    ip: Option[Boolean] = None,
    requestTime: Option[Boolean] = None,
    httpMethod: Option[Boolean] = None,
    responseLength: Option[Boolean] = None,
    status: Option[Boolean] = None,
    user: Option[Boolean] = None,
    protocol: Option[Boolean] = None,
    caller: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps =
    (new software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps.Builder)
      .resourcePath(resourcePath.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ip(ip.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requestTime(requestTime.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .httpMethod(httpMethod.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .responseLength(responseLength.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .status(status.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .user(user.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .protocol(protocol.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .caller(caller.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
