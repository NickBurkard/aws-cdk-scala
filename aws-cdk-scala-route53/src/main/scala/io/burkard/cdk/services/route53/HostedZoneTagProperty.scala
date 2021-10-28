package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HostedZoneTagProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty =
    (new software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
