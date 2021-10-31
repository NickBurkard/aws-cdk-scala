package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkAcl {

  def apply(
    internalResourceId: String,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    networkAclName: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.NetworkAcl =
    software.amazon.awscdk.services.ec2.NetworkAcl.Builder
      .create(stackCtx, internalResourceId)
      .subnetSelection(subnetSelection.orNull)
      .networkAclName(networkAclName.orNull)
      .vpc(vpc.orNull)
      .build()
}
