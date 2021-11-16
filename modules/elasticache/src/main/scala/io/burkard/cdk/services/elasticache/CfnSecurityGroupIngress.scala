package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecurityGroupIngress {

  def apply(
    internalResourceId: String,
    ec2SecurityGroupName: String,
    cacheSecurityGroupName: String,
    ec2SecurityGroupOwnerId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress =
    software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress.Builder
      .create(stackCtx, internalResourceId)
      .ec2SecurityGroupName(ec2SecurityGroupName)
      .cacheSecurityGroupName(cacheSecurityGroupName)
      .ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId.orNull)
      .build()
}
