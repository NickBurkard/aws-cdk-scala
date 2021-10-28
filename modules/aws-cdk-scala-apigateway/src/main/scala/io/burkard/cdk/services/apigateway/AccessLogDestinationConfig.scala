package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessLogDestinationConfig {

  def apply(
    destinationArn: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig =
    (new software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig.Builder)
      .destinationArn(destinationArn.orNull)
      .build()
}
