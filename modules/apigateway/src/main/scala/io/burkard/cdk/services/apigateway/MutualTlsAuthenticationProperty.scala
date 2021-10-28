package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MutualTlsAuthenticationProperty {

  def apply(
    truststoreVersion: Option[String] = None,
    truststoreUri: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty =
    (new software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty.Builder)
      .truststoreVersion(truststoreVersion.orNull)
      .truststoreUri(truststoreUri.orNull)
      .build()
}
