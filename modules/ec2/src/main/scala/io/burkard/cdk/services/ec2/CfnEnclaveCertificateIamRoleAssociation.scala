package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEnclaveCertificateIamRoleAssociation {

  def apply(
    internalResourceId: String,
    certificateArn: String,
    roleArn: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation =
    software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation.Builder
      .create(stackCtx, internalResourceId)
      .certificateArn(certificateArn)
      .roleArn(roleArn)
      .build()
}
