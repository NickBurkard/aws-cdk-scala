package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IpPermissionProperty {

  def apply(
    toPort: Option[Number] = None,
    fromPort: Option[Number] = None,
    ipRange: Option[String] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty =
    (new software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder)
      .toPort(toPort.orNull)
      .fromPort(fromPort.orNull)
      .ipRange(ipRange.orNull)
      .protocol(protocol.orNull)
      .build()
}
