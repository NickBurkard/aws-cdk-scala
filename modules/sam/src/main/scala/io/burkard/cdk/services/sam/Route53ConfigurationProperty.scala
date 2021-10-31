package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Route53ConfigurationProperty {

  def apply(
    hostedZoneId: Option[String] = None,
    hostedZoneName: Option[String] = None,
    ipV6: Option[Boolean] = None,
    evaluateTargetHealth: Option[Boolean] = None,
    distributedDomainName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty =
    (new software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty.Builder)
      .hostedZoneId(hostedZoneId.orNull)
      .hostedZoneName(hostedZoneName.orNull)
      .ipV6(ipV6.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .evaluateTargetHealth(evaluateTargetHealth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .distributedDomainName(distributedDomainName.orNull)
      .build()
}
