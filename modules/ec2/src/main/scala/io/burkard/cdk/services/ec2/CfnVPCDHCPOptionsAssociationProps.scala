package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCDHCPOptionsAssociationProps {

  def apply(
    dhcpOptionsId: String,
    vpcId: String
  ): software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps.Builder)
      .dhcpOptionsId(dhcpOptionsId)
      .vpcId(vpcId)
      .build()
}
