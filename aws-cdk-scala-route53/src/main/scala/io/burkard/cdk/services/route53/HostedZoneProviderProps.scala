package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HostedZoneProviderProps {

  def apply(
    vpcId: Option[String] = None,
    domainName: Option[String] = None,
    privateZone: Option[Boolean] = None
  ): software.amazon.awscdk.services.route53.HostedZoneProviderProps =
    (new software.amazon.awscdk.services.route53.HostedZoneProviderProps.Builder)
      .vpcId(vpcId.orNull)
      .domainName(domainName.orNull)
      .privateZone(privateZone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
