package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverConfig {

  def apply(
    internalResourceId: String,
    resourceId: String,
    autodefinedReverseFlag: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53resolver.CfnResolverConfig =
    software.amazon.awscdk.services.route53resolver.CfnResolverConfig.Builder
      .create(stackCtx, internalResourceId)
      .resourceId(resourceId)
      .autodefinedReverseFlag(autodefinedReverseFlag)
      .build()
}
