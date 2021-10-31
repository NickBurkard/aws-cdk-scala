package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDNSSECProps {

  def apply(
    hostedZoneId: Option[String] = None
  ): software.amazon.awscdk.services.route53.CfnDNSSECProps =
    (new software.amazon.awscdk.services.route53.CfnDNSSECProps.Builder)
      .hostedZoneId(hostedZoneId.orNull)
      .build()
}
