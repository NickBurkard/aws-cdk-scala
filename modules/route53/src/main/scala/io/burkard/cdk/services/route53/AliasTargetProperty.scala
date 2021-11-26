package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasTargetProperty {

  def apply(
    hostedZoneId: String,
    dnsName: String,
    evaluateTargetHealth: Option[Boolean] = None
  ): software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty =
    (new software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty.Builder)
      .hostedZoneId(hostedZoneId)
      .dnsName(dnsName)
      .evaluateTargetHealth(evaluateTargetHealth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
