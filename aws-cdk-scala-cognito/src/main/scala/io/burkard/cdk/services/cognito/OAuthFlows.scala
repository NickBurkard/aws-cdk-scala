package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OAuthFlows {

  def apply(
    implicitCodeGrant: Option[Boolean] = None,
    authorizationCodeGrant: Option[Boolean] = None,
    clientCredentials: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.OAuthFlows =
    (new software.amazon.awscdk.services.cognito.OAuthFlows.Builder)
      .implicitCodeGrant(implicitCodeGrant.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .authorizationCodeGrant(authorizationCodeGrant.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .clientCredentials(clientCredentials.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
