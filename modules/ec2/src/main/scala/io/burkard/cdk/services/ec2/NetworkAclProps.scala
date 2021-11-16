package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkAclProps {

  def apply(
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    networkAclName: Option[String] = None
  ): software.amazon.awscdk.services.ec2.NetworkAclProps =
    (new software.amazon.awscdk.services.ec2.NetworkAclProps.Builder)
      .vpc(vpc)
      .subnetSelection(subnetSelection.orNull)
      .networkAclName(networkAclName.orNull)
      .build()
}
