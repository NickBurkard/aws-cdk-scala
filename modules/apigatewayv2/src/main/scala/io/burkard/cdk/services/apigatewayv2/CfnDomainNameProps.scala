package io.burkard.cdk.services.apigatewayv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDomainNameProps {

  def apply(
    tags: Option[AnyRef] = None,
    domainName: Option[String] = None,
    mutualTlsAuthentication: Option[software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty] = None,
    domainNameConfigurations: Option[List[_]] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps.Builder)
      .tags(tags.orNull)
      .domainName(domainName.orNull)
      .mutualTlsAuthentication(mutualTlsAuthentication.orNull)
      .domainNameConfigurations(domainNameConfigurations.map(_.asJava).orNull)
      .build()
}
