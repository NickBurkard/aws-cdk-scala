package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasTargetProperty {

  def apply(
    hostedZoneId: Option[String] = None,
    dnsName: Option[String] = None,
    evaluateTargetHealth: Option[Boolean] = None
  ): software.amazon.awscdk.services.route53.CfnRecordSet.AliasTargetProperty =
    (new software.amazon.awscdk.services.route53.CfnRecordSet.AliasTargetProperty.Builder)
      .hostedZoneId(hostedZoneId.orNull)
      .dnsName(dnsName.orNull)
      .evaluateTargetHealth(evaluateTargetHealth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
