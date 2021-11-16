package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverConfigProps {

  def apply(
    resourceId: String,
    autodefinedReverseFlag: String
  ): software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps.Builder)
      .resourceId(resourceId)
      .autodefinedReverseFlag(autodefinedReverseFlag)
      .build()
}
