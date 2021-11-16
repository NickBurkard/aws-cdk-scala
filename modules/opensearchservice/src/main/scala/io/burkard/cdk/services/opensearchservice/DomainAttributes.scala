package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainAttributes {

  def apply(
    domainArn: String,
    domainEndpoint: String
  ): software.amazon.awscdk.services.opensearchservice.DomainAttributes =
    (new software.amazon.awscdk.services.opensearchservice.DomainAttributes.Builder)
      .domainArn(domainArn)
      .domainEndpoint(domainEndpoint)
      .build()
}
