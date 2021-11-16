package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEnclaveCertificateIamRoleAssociationProps {

  def apply(
    certificateArn: String,
    roleArn: String
  ): software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps.Builder)
      .certificateArn(certificateArn)
      .roleArn(roleArn)
      .build()
}
