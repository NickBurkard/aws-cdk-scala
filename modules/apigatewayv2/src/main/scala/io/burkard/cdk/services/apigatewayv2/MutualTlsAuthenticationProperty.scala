package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MutualTlsAuthenticationProperty {

  def apply(
    truststoreVersion: Option[String] = None,
    truststoreUri: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty.Builder)
      .truststoreVersion(truststoreVersion.orNull)
      .truststoreUri(truststoreUri.orNull)
      .build()
}
