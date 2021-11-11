package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverConfigProps {

  def apply(
    resourceId: Option[String] = None,
    autodefinedReverseFlag: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps.Builder)
      .resourceId(resourceId.orNull)
      .autodefinedReverseFlag(autodefinedReverseFlag.orNull)
      .build()
}
