package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverRuleAssociationProps {

  def apply(
    resolverRuleId: String,
    vpcId: String,
    name: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder)
      .resolverRuleId(resolverRuleId)
      .vpcId(vpcId)
      .name(name.orNull)
      .build()
}
