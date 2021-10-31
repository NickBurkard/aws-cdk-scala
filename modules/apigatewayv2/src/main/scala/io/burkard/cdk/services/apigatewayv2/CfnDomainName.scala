package io.burkard.cdk.services.apigatewayv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomainName {

  def apply(
    internalResourceId: String,
    tags: Option[AnyRef] = None,
    domainName: Option[String] = None,
    mutualTlsAuthentication: Option[software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty] = None,
    domainNameConfigurations: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnDomainName =
    software.amazon.awscdk.services.apigatewayv2.CfnDomainName.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.orNull)
      .domainName(domainName.orNull)
      .mutualTlsAuthentication(mutualTlsAuthentication.orNull)
      .domainNameConfigurations(domainNameConfigurations.map(_.asJava).orNull)
      .build()
}
