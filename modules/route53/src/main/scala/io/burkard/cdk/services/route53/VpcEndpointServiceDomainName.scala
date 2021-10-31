package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcEndpointServiceDomainName {

  def apply(
    internalResourceId: String,
    endpointService: Option[software.amazon.awscdk.services.ec2.IVpcEndpointService] = None,
    publicHostedZone: Option[software.amazon.awscdk.services.route53.IPublicHostedZone] = None,
    domainName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName =
    software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName.Builder
      .create(stackCtx, internalResourceId)
      .endpointService(endpointService.orNull)
      .publicHostedZone(publicHostedZone.orNull)
      .domainName(domainName.orNull)
      .build()
}
