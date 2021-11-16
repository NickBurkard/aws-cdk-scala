package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddRouteOptions {

  def apply(
    routerId: String,
    routerType: software.amazon.awscdk.services.ec2.RouterType,
    destinationIpv6CidrBlock: Option[String] = None,
    enablesInternetConnectivity: Option[Boolean] = None,
    destinationCidrBlock: Option[String] = None
  ): software.amazon.awscdk.services.ec2.AddRouteOptions =
    (new software.amazon.awscdk.services.ec2.AddRouteOptions.Builder)
      .routerId(routerId)
      .routerType(routerType)
      .destinationIpv6CidrBlock(destinationIpv6CidrBlock.orNull)
      .enablesInternetConnectivity(enablesInternetConnectivity.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .destinationCidrBlock(destinationCidrBlock.orNull)
      .build()
}
