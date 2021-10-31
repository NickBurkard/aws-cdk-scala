package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverQueryLoggingConfigAssociationProps {

  def apply(
    resourceId: Option[String] = None,
    resolverQueryLogConfigId: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps.Builder)
      .resourceId(resourceId.orNull)
      .resolverQueryLogConfigId(resolverQueryLogConfigId.orNull)
      .build()
}
