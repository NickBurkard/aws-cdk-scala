package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainNameAttributes {

  def apply(
    domainNameAliasHostedZoneId: String,
    domainName: String,
    domainNameAliasTarget: String
  ): software.amazon.awscdk.services.apigateway.DomainNameAttributes =
    (new software.amazon.awscdk.services.apigateway.DomainNameAttributes.Builder)
      .domainNameAliasHostedZoneId(domainNameAliasHostedZoneId)
      .domainName(domainName)
      .domainNameAliasTarget(domainNameAliasTarget)
      .build()
}
