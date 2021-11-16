package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IpAddressRequestProperty {

  def apply(
    subnetId: String,
    ip: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.Builder)
      .subnetId(subnetId)
      .ip(ip.orNull)
      .build()
}
