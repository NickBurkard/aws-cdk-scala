package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateSubnet {

  def apply(
    internalResourceId: String,
    vpcId: Option[String] = None,
    availabilityZone: Option[String] = None,
    cidrBlock: Option[String] = None,
    mapPublicIpOnLaunch: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.PrivateSubnet =
    software.amazon.awscdk.services.ec2.PrivateSubnet.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId.orNull)
      .availabilityZone(availabilityZone.orNull)
      .cidrBlock(cidrBlock.orNull)
      .mapPublicIpOnLaunch(mapPublicIpOnLaunch.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
