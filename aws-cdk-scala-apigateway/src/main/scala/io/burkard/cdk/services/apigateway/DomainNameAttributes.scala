package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DomainNameAttributes {

  def apply(
    domainNameAliasHostedZoneId: Option[String] = None,
    domainName: Option[String] = None,
    domainNameAliasTarget: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.DomainNameAttributes =
    (new software.amazon.awscdk.services.apigateway.DomainNameAttributes.Builder)
      .domainNameAliasHostedZoneId(domainNameAliasHostedZoneId.orNull)
      .domainName(domainName.orNull)
      .domainNameAliasTarget(domainNameAliasTarget.orNull)
      .build()
}
