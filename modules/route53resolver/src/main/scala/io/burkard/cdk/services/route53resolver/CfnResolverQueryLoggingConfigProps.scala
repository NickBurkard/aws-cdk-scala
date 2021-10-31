package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverQueryLoggingConfigProps {

  def apply(
    name: Option[String] = None,
    destinationArn: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps.Builder)
      .name(name.orNull)
      .destinationArn(destinationArn.orNull)
      .build()
}
