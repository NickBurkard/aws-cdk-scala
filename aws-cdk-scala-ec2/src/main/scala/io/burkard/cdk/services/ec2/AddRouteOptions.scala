package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AddRouteOptions {

  def apply(
    routerId: Option[String] = None,
    routerType: Option[software.amazon.awscdk.services.ec2.RouterType] = None,
    destinationIpv6CidrBlock: Option[String] = None,
    enablesInternetConnectivity: Option[Boolean] = None,
    destinationCidrBlock: Option[String] = None
  ): software.amazon.awscdk.services.ec2.AddRouteOptions =
    (new software.amazon.awscdk.services.ec2.AddRouteOptions.Builder)
      .routerId(routerId.orNull)
      .routerType(routerType.orNull)
      .destinationIpv6CidrBlock(destinationIpv6CidrBlock.orNull)
      .enablesInternetConnectivity(enablesInternetConnectivity.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .destinationCidrBlock(destinationCidrBlock.orNull)
      .build()
}
