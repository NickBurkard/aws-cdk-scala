package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessLogDestinationConfig {

  def apply(
    destinationArn: String
  ): software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig =
    (new software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig.Builder)
      .destinationArn(destinationArn)
      .build()
}
