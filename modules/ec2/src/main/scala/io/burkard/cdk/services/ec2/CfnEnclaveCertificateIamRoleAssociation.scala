package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEnclaveCertificateIamRoleAssociation {

  def apply(
    internalResourceId: String,
    certificateArn: Option[String] = None,
    roleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation =
    software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation.Builder
      .create(stackCtx, internalResourceId)
      .certificateArn(certificateArn.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
