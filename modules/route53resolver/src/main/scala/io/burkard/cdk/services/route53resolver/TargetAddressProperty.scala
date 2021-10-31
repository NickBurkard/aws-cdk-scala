package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetAddressProperty {

  def apply(
    ip: Option[String] = None,
    port: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty.Builder)
      .ip(ip.orNull)
      .port(port.orNull)
      .build()
}
