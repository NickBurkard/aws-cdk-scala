package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AclTrafficConfig {

  def apply(
    portRange: Option[software.amazon.awscdk.services.ec2.AclPortRange] = None,
    icmp: Option[software.amazon.awscdk.services.ec2.AclIcmp] = None,
    protocol: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.AclTrafficConfig =
    (new software.amazon.awscdk.services.ec2.AclTrafficConfig.Builder)
      .portRange(portRange.orNull)
      .icmp(icmp.orNull)
      .protocol(protocol.orNull)
      .build()
}
