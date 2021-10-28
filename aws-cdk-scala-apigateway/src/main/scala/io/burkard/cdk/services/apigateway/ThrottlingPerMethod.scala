package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ThrottlingPerMethod {

  def apply(
    method: Option[software.amazon.awscdk.services.apigateway.Method] = None,
    throttle: Option[software.amazon.awscdk.services.apigateway.ThrottleSettings] = None
  ): software.amazon.awscdk.services.apigateway.ThrottlingPerMethod =
    (new software.amazon.awscdk.services.apigateway.ThrottlingPerMethod.Builder)
      .method(method.orNull)
      .throttle(throttle.orNull)
      .build()
}
