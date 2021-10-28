package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CognitoIdentityProviderProperty {

  def apply(
    clientId: Option[String] = None,
    serverSideTokenCheck: Option[Boolean] = None,
    providerName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty =
    (new software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.Builder)
      .clientId(clientId.orNull)
      .serverSideTokenCheck(serverSideTokenCheck.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .providerName(providerName.orNull)
      .build()
}
