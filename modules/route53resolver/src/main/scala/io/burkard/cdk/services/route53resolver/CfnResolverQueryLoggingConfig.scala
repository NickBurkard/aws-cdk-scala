package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverQueryLoggingConfig {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    destinationArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig =
    software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .destinationArn(destinationArn.orNull)
      .build()
}
