package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkAcl {

  def apply(
    internalResourceId: String,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    networkAclName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.NetworkAcl =
    software.amazon.awscdk.services.ec2.NetworkAcl.Builder
      .create(stackCtx, internalResourceId)
      .vpc(vpc)
      .subnetSelection(subnetSelection.orNull)
      .networkAclName(networkAclName.orNull)
      .build()
}
