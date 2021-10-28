package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResolverRuleAssociation {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    resolverRuleId: Option[String] = None,
    vpcId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation =
    software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .resolverRuleId(resolverRuleId.orNull)
      .vpcId(vpcId.orNull)
      .build()
}
