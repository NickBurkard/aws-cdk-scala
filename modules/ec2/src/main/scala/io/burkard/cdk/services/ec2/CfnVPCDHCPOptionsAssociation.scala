package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPCDHCPOptionsAssociation {

  def apply(
    internalResourceId: String,
    dhcpOptionsId: Option[String] = None,
    vpcId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation =
    software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation.Builder
      .create(stackCtx, internalResourceId)
      .dhcpOptionsId(dhcpOptionsId.orNull)
      .vpcId(vpcId.orNull)
      .build()
}
