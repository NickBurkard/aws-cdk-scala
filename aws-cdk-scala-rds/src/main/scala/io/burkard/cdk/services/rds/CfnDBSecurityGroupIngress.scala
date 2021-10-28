package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBSecurityGroupIngress {

  def apply(
    internalResourceId: String,
    cidrip: Option[String] = None,
    dbSecurityGroupName: Option[String] = None,
    ec2SecurityGroupName: Option[String] = None,
    ec2SecurityGroupOwnerId: Option[String] = None,
    ec2SecurityGroupId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress =
    software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress.Builder
      .create(stackCtx, internalResourceId)
      .cidrip(cidrip.orNull)
      .dbSecurityGroupName(dbSecurityGroupName.orNull)
      .ec2SecurityGroupName(ec2SecurityGroupName.orNull)
      .ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId.orNull)
      .ec2SecurityGroupId(ec2SecurityGroupId.orNull)
      .build()
}
