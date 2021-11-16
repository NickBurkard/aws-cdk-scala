package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileSystemAttributes {

  def apply(
    dnsName: String,
    fileSystemId: String,
    securityGroup: software.amazon.awscdk.services.ec2.ISecurityGroup
  ): software.amazon.awscdk.services.fsx.FileSystemAttributes =
    (new software.amazon.awscdk.services.fsx.FileSystemAttributes.Builder)
      .dnsName(dnsName)
      .fileSystemId(fileSystemId)
      .securityGroup(securityGroup)
      .build()
}
