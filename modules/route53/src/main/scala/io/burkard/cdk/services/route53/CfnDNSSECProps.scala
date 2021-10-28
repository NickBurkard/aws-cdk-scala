package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDNSSECProps {

  def apply(
    hostedZoneId: Option[String] = None
  ): software.amazon.awscdk.services.route53.CfnDNSSECProps =
    (new software.amazon.awscdk.services.route53.CfnDNSSECProps.Builder)
      .hostedZoneId(hostedZoneId.orNull)
      .build()
}
