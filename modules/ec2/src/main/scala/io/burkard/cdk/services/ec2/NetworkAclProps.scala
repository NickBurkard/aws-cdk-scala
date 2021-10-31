package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkAclProps {

  def apply(
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    networkAclName: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.services.ec2.NetworkAclProps =
    (new software.amazon.awscdk.services.ec2.NetworkAclProps.Builder)
      .subnetSelection(subnetSelection.orNull)
      .networkAclName(networkAclName.orNull)
      .vpc(vpc.orNull)
      .build()
}
