package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterSecurityGroupIngress {

  def apply(
    internalResourceId: String,
    cidrip: Option[String] = None,
    clusterSecurityGroupName: Option[String] = None,
    ec2SecurityGroupName: Option[String] = None,
    ec2SecurityGroupOwnerId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress =
    software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress.Builder
      .create(stackCtx, internalResourceId)
      .cidrip(cidrip.orNull)
      .clusterSecurityGroupName(clusterSecurityGroupName.orNull)
      .ec2SecurityGroupName(ec2SecurityGroupName.orNull)
      .ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId.orNull)
      .build()
}
