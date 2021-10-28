package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OpenIDConnectConfigProperty {

  def apply(
    authTtl: Option[Number] = None,
    clientId: Option[String] = None,
    issuer: Option[String] = None,
    iatTtl: Option[Number] = None
  ): software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder)
      .authTtl(authTtl.orNull)
      .clientId(clientId.orNull)
      .issuer(issuer.orNull)
      .iatTtl(iatTtl.orNull)
      .build()
}
