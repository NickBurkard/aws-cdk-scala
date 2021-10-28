package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSecurityGroupIngressProps {

  def apply(
    ec2SecurityGroupName: Option[String] = None,
    cacheSecurityGroupName: Option[String] = None,
    ec2SecurityGroupOwnerId: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps =
    (new software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder)
      .ec2SecurityGroupName(ec2SecurityGroupName.orNull)
      .cacheSecurityGroupName(cacheSecurityGroupName.orNull)
      .ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId.orNull)
      .build()
}
