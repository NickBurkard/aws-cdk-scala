package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubnetProps {

  def apply(
    vpcId: String,
    availabilityZone: String,
    cidrBlock: String,
    mapPublicIpOnLaunch: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.SubnetProps =
    (new software.amazon.awscdk.services.ec2.SubnetProps.Builder)
      .vpcId(vpcId)
      .availabilityZone(availabilityZone)
      .cidrBlock(cidrBlock)
      .mapPublicIpOnLaunch(mapPublicIpOnLaunch.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
