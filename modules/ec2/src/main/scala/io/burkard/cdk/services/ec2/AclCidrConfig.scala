package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AclCidrConfig {

  def apply(
    cidrBlock: Option[String] = None,
    ipv6CidrBlock: Option[String] = None
  ): software.amazon.awscdk.services.ec2.AclCidrConfig =
    (new software.amazon.awscdk.services.ec2.AclCidrConfig.Builder)
      .cidrBlock(cidrBlock.orNull)
      .ipv6CidrBlock(ipv6CidrBlock.orNull)
      .build()
}
