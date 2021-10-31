package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIdentityPoolProps {

  def apply(
    allowClassicFlow: Option[Boolean] = None,
    identityPoolName: Option[String] = None,
    allowUnauthenticatedIdentities: Option[Boolean] = None,
    pushSync: Option[software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty] = None,
    cognitoStreams: Option[software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty] = None,
    supportedLoginProviders: Option[AnyRef] = None,
    openIdConnectProviderArns: Option[List[String]] = None,
    cognitoIdentityProviders: Option[List[_]] = None,
    cognitoEvents: Option[AnyRef] = None,
    samlProviderArns: Option[List[String]] = None,
    developerProviderName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnIdentityPoolProps =
    (new software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder)
      .allowClassicFlow(allowClassicFlow.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .identityPoolName(identityPoolName.orNull)
      .allowUnauthenticatedIdentities(allowUnauthenticatedIdentities.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .pushSync(pushSync.orNull)
      .cognitoStreams(cognitoStreams.orNull)
      .supportedLoginProviders(supportedLoginProviders.orNull)
      .openIdConnectProviderArns(openIdConnectProviderArns.map(_.asJava).orNull)
      .cognitoIdentityProviders(cognitoIdentityProviders.map(_.asJava).orNull)
      .cognitoEvents(cognitoEvents.orNull)
      .samlProviderArns(samlProviderArns.map(_.asJava).orNull)
      .developerProviderName(developerProviderName.orNull)
      .build()
}
