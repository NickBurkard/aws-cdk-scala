package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcEndpointServiceDomainNameProps {

  def apply(
    endpointService: Option[software.amazon.awscdk.services.ec2.IVpcEndpointService] = None,
    publicHostedZone: Option[software.amazon.awscdk.services.route53.IPublicHostedZone] = None,
    domainName: Option[String] = None
  ): software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps =
    (new software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps.Builder)
      .endpointService(endpointService.orNull)
      .publicHostedZone(publicHostedZone.orNull)
      .domainName(domainName.orNull)
      .build()
}
