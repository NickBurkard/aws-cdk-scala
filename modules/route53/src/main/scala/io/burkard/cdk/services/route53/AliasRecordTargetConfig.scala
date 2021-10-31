package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasRecordTargetConfig {

  def apply(
    hostedZoneId: Option[String] = None,
    dnsName: Option[String] = None
  ): software.amazon.awscdk.services.route53.AliasRecordTargetConfig =
    (new software.amazon.awscdk.services.route53.AliasRecordTargetConfig.Builder)
      .hostedZoneId(hostedZoneId.orNull)
      .dnsName(dnsName.orNull)
      .build()
}
