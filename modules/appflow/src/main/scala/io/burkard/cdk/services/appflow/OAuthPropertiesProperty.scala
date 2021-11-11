package io.burkard.cdk.services.appflow

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OAuthPropertiesProperty {

  def apply(
    authCodeUrl: Option[String] = None,
    oAuthScopes: Option[List[String]] = None,
    tokenUrl: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty.Builder)
      .authCodeUrl(authCodeUrl.orNull)
      .oAuthScopes(oAuthScopes.map(_.asJava).orNull)
      .tokenUrl(tokenUrl.orNull)
      .build()
}
