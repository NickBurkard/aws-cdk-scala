package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JWTConfigurationProperty {

  def apply(
    audience: Option[List[String]] = None,
    issuer: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnAuthorizerV2.JWTConfigurationProperty =
    (new software.amazon.awscdk.services.apigateway.CfnAuthorizerV2.JWTConfigurationProperty.Builder)
      .audience(audience.map(_.asJava).orNull)
      .issuer(issuer.orNull)
      .build()
}
