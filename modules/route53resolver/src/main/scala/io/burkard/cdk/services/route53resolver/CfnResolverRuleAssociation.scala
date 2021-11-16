package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverRuleAssociation {

  def apply(
    internalResourceId: String,
    resolverRuleId: String,
    vpcId: String,
    name: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation =
    software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation.Builder
      .create(stackCtx, internalResourceId)
      .resolverRuleId(resolverRuleId)
      .vpcId(vpcId)
      .name(name.orNull)
      .build()
}
