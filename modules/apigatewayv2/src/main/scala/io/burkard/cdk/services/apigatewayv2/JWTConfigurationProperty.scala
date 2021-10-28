package io.burkard.cdk.services.apigatewayv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JWTConfigurationProperty {

  def apply(
    audience: Option[List[String]] = None,
    issuer: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty.Builder)
      .audience(audience.map(_.asJava).orNull)
      .issuer(issuer.orNull)
      .build()
}
