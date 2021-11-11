package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcSecurityGroupProperty {

  def apply(
    vpcSecurityGroupId: Option[String] = None,
    status: Option[String] = None
  ): software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty =
    (new software.amazon.awscdk.services.redshift.CfnEndpointAccess.VpcSecurityGroupProperty.Builder)
      .vpcSecurityGroupId(vpcSecurityGroupId.orNull)
      .status(status.orNull)
      .build()
}
