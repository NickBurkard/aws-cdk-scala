package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileSystemAttributes {

  def apply(
    securityGroup: software.amazon.awscdk.services.ec2.ISecurityGroup,
    fileSystemArn: Option[String] = None,
    fileSystemId: Option[String] = None
  ): software.amazon.awscdk.services.efs.FileSystemAttributes =
    (new software.amazon.awscdk.services.efs.FileSystemAttributes.Builder)
      .securityGroup(securityGroup)
      .fileSystemArn(fileSystemArn.orNull)
      .fileSystemId(fileSystemId.orNull)
      .build()
}
