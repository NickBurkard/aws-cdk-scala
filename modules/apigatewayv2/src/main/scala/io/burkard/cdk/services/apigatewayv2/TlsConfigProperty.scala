package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TlsConfigProperty {

  def apply(
    serverNameToVerify: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty.Builder)
      .serverNameToVerify(serverNameToVerify.orNull)
      .build()
}
