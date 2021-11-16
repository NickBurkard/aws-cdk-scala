package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcEndpointServiceDomainNameProps {

  def apply(
    endpointService: software.amazon.awscdk.services.ec2.IVpcEndpointService,
    publicHostedZone: software.amazon.awscdk.services.route53.IPublicHostedZone,
    domainName: String
  ): software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps =
    (new software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps.Builder)
      .endpointService(endpointService)
      .publicHostedZone(publicHostedZone)
      .domainName(domainName)
      .build()
}
