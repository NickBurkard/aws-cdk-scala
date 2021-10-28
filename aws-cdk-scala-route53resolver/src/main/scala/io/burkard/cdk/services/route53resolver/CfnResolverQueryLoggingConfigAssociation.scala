package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResolverQueryLoggingConfigAssociation {

  def apply(
    internalResourceId: String,
    resourceId: Option[String] = None,
    resolverQueryLogConfigId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation =
    software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation.Builder
      .create(stackCtx, internalResourceId)
      .resourceId(resourceId.orNull)
      .resolverQueryLogConfigId(resolverQueryLogConfigId.orNull)
      .build()
}
