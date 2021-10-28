package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileSystemAttributes {

  def apply(
    dnsName: Option[String] = None,
    fileSystemId: Option[String] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.fsx.FileSystemAttributes =
    (new software.amazon.awscdk.services.fsx.FileSystemAttributes.Builder)
      .dnsName(dnsName.orNull)
      .fileSystemId(fileSystemId.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
