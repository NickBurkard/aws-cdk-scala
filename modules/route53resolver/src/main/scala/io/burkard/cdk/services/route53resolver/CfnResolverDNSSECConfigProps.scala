package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverDNSSECConfigProps {

  def apply(
    resourceId: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps.Builder)
      .resourceId(resourceId.orNull)
      .build()
}
