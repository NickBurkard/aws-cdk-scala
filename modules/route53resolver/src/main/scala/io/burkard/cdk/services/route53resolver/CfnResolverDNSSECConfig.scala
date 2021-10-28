package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResolverDNSSECConfig {

  def apply(
    internalResourceId: String,
    resourceId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig =
    software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig.Builder
      .create(stackCtx, internalResourceId)
      .resourceId(resourceId.orNull)
      .build()
}
