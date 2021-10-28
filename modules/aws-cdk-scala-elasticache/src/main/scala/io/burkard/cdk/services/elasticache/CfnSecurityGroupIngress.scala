package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSecurityGroupIngress {

  def apply(
    internalResourceId: String,
    ec2SecurityGroupName: Option[String] = None,
    cacheSecurityGroupName: Option[String] = None,
    ec2SecurityGroupOwnerId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress =
    software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress.Builder
      .create(stackCtx, internalResourceId)
      .ec2SecurityGroupName(ec2SecurityGroupName.orNull)
      .cacheSecurityGroupName(cacheSecurityGroupName.orNull)
      .ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId.orNull)
      .build()
}
