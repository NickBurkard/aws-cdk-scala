package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HostedZoneAttributes {

  def apply(
    hostedZoneId: String,
    zoneName: String
  ): software.amazon.awscdk.services.route53.HostedZoneAttributes =
    (new software.amazon.awscdk.services.route53.HostedZoneAttributes.Builder)
      .hostedZoneId(hostedZoneId)
      .zoneName(zoneName)
      .build()
}
