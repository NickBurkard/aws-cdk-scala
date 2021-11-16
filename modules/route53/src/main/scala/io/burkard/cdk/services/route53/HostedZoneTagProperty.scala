package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HostedZoneTagProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty =
    (new software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
