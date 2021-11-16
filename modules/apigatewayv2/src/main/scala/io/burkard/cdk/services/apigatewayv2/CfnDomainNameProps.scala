package io.burkard.cdk.services.apigatewayv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomainNameProps {

  def apply(
    domainName: String,
    tags: Option[AnyRef] = None,
    mutualTlsAuthentication: Option[software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty] = None,
    domainNameConfigurations: Option[List[_]] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps.Builder)
      .domainName(domainName)
      .tags(tags.orNull)
      .mutualTlsAuthentication(mutualTlsAuthentication.orNull)
      .domainNameConfigurations(domainNameConfigurations.map(_.asJava).orNull)
      .build()
}
