package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IpPermissionProperty {

  def apply(
    toPort: Number,
    fromPort: Number,
    ipRange: String,
    protocol: String
  ): software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty =
    (new software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder)
      .toPort(toPort)
      .fromPort(fromPort)
      .ipRange(ipRange)
      .protocol(protocol)
      .build()
}
