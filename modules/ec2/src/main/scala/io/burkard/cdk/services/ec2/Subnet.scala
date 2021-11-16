package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Subnet {

  def apply(
    internalResourceId: String,
    vpcId: String,
    availabilityZone: String,
    cidrBlock: String,
    mapPublicIpOnLaunch: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.Subnet =
    software.amazon.awscdk.services.ec2.Subnet.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId)
      .availabilityZone(availabilityZone)
      .cidrBlock(cidrBlock)
      .mapPublicIpOnLaunch(mapPublicIpOnLaunch.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
