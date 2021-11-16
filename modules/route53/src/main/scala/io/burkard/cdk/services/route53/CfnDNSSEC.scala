package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDNSSEC {

  def apply(
    internalResourceId: String,
    hostedZoneId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CfnDNSSEC =
    software.amazon.awscdk.services.route53.CfnDNSSEC.Builder
      .create(stackCtx, internalResourceId)
      .hostedZoneId(hostedZoneId)
      .build()
}
