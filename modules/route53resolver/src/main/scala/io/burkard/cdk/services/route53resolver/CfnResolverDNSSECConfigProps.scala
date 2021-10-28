package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResolverDNSSECConfigProps {

  def apply(
    resourceId: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps.Builder)
      .resourceId(resourceId.orNull)
      .build()
}
