package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterSecurityGroupIngressProps {

  def apply(
    cidrip: Option[String] = None,
    clusterSecurityGroupName: Option[String] = None,
    ec2SecurityGroupName: Option[String] = None,
    ec2SecurityGroupOwnerId: Option[String] = None
  ): software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps =
    (new software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder)
      .cidrip(cidrip.orNull)
      .clusterSecurityGroupName(clusterSecurityGroupName.orNull)
      .ec2SecurityGroupName(ec2SecurityGroupName.orNull)
      .ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId.orNull)
      .build()
}
