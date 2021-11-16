package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainAttributes {

  def apply(
    domainArn: String,
    domainEndpoint: String
  ): software.amazon.awscdk.services.elasticsearch.DomainAttributes =
    (new software.amazon.awscdk.services.elasticsearch.DomainAttributes.Builder)
      .domainArn(domainArn)
      .domainEndpoint(domainEndpoint)
      .build()
}
