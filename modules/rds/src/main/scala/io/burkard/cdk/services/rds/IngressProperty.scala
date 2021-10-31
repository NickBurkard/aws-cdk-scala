package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IngressProperty {

  def apply(
    cidrip: Option[String] = None,
    ec2SecurityGroupName: Option[String] = None,
    ec2SecurityGroupOwnerId: Option[String] = None,
    ec2SecurityGroupId: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty =
    (new software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty.Builder)
      .cidrip(cidrip.orNull)
      .ec2SecurityGroupName(ec2SecurityGroupName.orNull)
      .ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId.orNull)
      .ec2SecurityGroupId(ec2SecurityGroupId.orNull)
      .build()
}
