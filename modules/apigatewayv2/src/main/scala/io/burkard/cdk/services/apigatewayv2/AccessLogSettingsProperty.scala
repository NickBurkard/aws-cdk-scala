package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessLogSettingsProperty {

  def apply(
    format: Option[String] = None,
    destinationArn: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty.Builder)
      .format(format.orNull)
      .destinationArn(destinationArn.orNull)
      .build()
}
