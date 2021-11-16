package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AclTrafficConfig {

  def apply(
    protocol: Number,
    portRange: Option[software.amazon.awscdk.services.ec2.AclPortRange] = None,
    icmp: Option[software.amazon.awscdk.services.ec2.AclIcmp] = None
  ): software.amazon.awscdk.services.ec2.AclTrafficConfig =
    (new software.amazon.awscdk.services.ec2.AclTrafficConfig.Builder)
      .protocol(protocol)
      .portRange(portRange.orNull)
      .icmp(icmp.orNull)
      .build()
}
