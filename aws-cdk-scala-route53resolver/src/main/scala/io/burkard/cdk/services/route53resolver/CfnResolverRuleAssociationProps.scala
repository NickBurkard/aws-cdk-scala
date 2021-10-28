package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResolverRuleAssociationProps {

  def apply(
    name: Option[String] = None,
    resolverRuleId: Option[String] = None,
    vpcId: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder)
      .name(name.orNull)
      .resolverRuleId(resolverRuleId.orNull)
      .vpcId(vpcId.orNull)
      .build()
}
