package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DomainAttributes {

  def apply(
    domainArn: Option[String] = None,
    domainEndpoint: Option[String] = None
  ): software.amazon.awscdk.services.elasticsearch.DomainAttributes =
    (new software.amazon.awscdk.services.elasticsearch.DomainAttributes.Builder)
      .domainArn(domainArn.orNull)
      .domainEndpoint(domainEndpoint.orNull)
      .build()
}
