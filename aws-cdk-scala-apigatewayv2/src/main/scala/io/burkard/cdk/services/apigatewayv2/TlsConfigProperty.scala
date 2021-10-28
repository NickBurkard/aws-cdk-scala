package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TlsConfigProperty {

  def apply(
    serverNameToVerify: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty.Builder)
      .serverNameToVerify(serverNameToVerify.orNull)
      .build()
}
