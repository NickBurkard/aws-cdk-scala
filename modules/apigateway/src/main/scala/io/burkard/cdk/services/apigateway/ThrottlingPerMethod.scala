package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ThrottlingPerMethod {

  def apply(
    method: software.amazon.awscdk.services.apigateway.Method,
    throttle: software.amazon.awscdk.services.apigateway.ThrottleSettings
  ): software.amazon.awscdk.services.apigateway.ThrottlingPerMethod =
    (new software.amazon.awscdk.services.apigateway.ThrottlingPerMethod.Builder)
      .method(method)
      .throttle(throttle)
      .build()
}
