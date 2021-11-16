package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCDHCPOptionsAssociation {

  def apply(
    internalResourceId: String,
    dhcpOptionsId: String,
    vpcId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation =
    software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation.Builder
      .create(stackCtx, internalResourceId)
      .dhcpOptionsId(dhcpOptionsId)
      .vpcId(vpcId)
      .build()
}
