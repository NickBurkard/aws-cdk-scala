package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBSecurityGroupIngressProps {

  def apply(
    cidrip: Option[String] = None,
    dbSecurityGroupName: Option[String] = None,
    ec2SecurityGroupName: Option[String] = None,
    ec2SecurityGroupOwnerId: Option[String] = None,
    ec2SecurityGroupId: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps =
    (new software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps.Builder)
      .cidrip(cidrip.orNull)
      .dbSecurityGroupName(dbSecurityGroupName.orNull)
      .ec2SecurityGroupName(ec2SecurityGroupName.orNull)
      .ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId.orNull)
      .ec2SecurityGroupId(ec2SecurityGroupId.orNull)
      .build()
}
