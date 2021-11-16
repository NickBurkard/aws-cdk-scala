package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HostedZoneProviderProps {

  def apply(
    domainName: String,
    vpcId: Option[String] = None,
    privateZone: Option[Boolean] = None
  ): software.amazon.awscdk.services.route53.HostedZoneProviderProps =
    (new software.amazon.awscdk.services.route53.HostedZoneProviderProps.Builder)
      .domainName(domainName)
      .vpcId(vpcId.orNull)
      .privateZone(privateZone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
