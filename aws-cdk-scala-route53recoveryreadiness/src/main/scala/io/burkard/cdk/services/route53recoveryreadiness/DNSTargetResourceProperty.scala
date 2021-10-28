package io.burkard.cdk.services.route53recoveryreadiness

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DNSTargetResourceProperty {

  def apply(
    recordType: Option[String] = None,
    targetResource: Option[software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty] = None,
    hostedZoneArn: Option[String] = None,
    domainName: Option[String] = None,
    recordSetId: Option[String] = None
  ): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty =
    (new software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty.Builder)
      .recordType(recordType.orNull)
      .targetResource(targetResource.orNull)
      .hostedZoneArn(hostedZoneArn.orNull)
      .domainName(domainName.orNull)
      .recordSetId(recordSetId.orNull)
      .build()
}
