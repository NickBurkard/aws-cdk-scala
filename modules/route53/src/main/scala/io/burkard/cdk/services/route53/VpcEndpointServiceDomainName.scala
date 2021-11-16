package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcEndpointServiceDomainName {

  def apply(
    internalResourceId: String,
    endpointService: software.amazon.awscdk.services.ec2.IVpcEndpointService,
    publicHostedZone: software.amazon.awscdk.services.route53.IPublicHostedZone,
    domainName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName =
    software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName.Builder
      .create(stackCtx, internalResourceId)
      .endpointService(endpointService)
      .publicHostedZone(publicHostedZone)
      .domainName(domainName)
      .build()
}
