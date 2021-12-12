package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubnetConfiguration {

  def apply(
    name: String,
    subnetType: software.amazon.awscdk.services.ec2.SubnetType,
    reserved: Option[Boolean] = None,
    cidrMask: Option[Number] = None,
    mapPublicIpOnLaunch: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.SubnetConfiguration =
    (new software.amazon.awscdk.services.ec2.SubnetConfiguration.Builder)
      .name(name)
      .subnetType(subnetType)
      .reserved(reserved.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cidrMask(cidrMask.orNull)
      .mapPublicIpOnLaunch(mapPublicIpOnLaunch.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
