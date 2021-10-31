package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileSystemAttributes {

  def apply(
    fileSystemArn: Option[String] = None,
    fileSystemId: Option[String] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.efs.FileSystemAttributes =
    (new software.amazon.awscdk.services.efs.FileSystemAttributes.Builder)
      .fileSystemArn(fileSystemArn.orNull)
      .fileSystemId(fileSystemId.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
