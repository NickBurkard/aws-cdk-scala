package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecurityGroupIngressProps {

  def apply(
    ec2SecurityGroupName: String,
    cacheSecurityGroupName: String,
    ec2SecurityGroupOwnerId: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps =
    (new software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder)
      .ec2SecurityGroupName(ec2SecurityGroupName)
      .cacheSecurityGroupName(cacheSecurityGroupName)
      .ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId.orNull)
      .build()
}
