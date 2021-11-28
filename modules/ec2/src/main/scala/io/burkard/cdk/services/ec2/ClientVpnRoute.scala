package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientVpnRoute {

  def apply(
    internalResourceId: String,
    cidr: Option[String] = None,
    description: Option[String] = None,
    clientVpnEndpoint: Option[software.amazon.awscdk.services.ec2.IClientVpnEndpoint] = None,
    target: Option[software.amazon.awscdk.services.ec2.ClientVpnRouteTarget] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.ClientVpnRoute =
    software.amazon.awscdk.services.ec2.ClientVpnRoute.Builder
      .create(stackCtx, internalResourceId)
      .cidr(cidr.orNull)
      .description(description.orNull)
      .clientVpnEndpoint(clientVpnEndpoint.orNull)
      .target(target.orNull)
      .build()
}
