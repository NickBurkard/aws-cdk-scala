package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileSystemProps {

  def apply(
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    backupId: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    storageCapacityGiB: Option[Number] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.fsx.FileSystemProps =
    (new software.amazon.awscdk.services.fsx.FileSystemProps.Builder)
      .kmsKey(kmsKey.orNull)
      .backupId(backupId.orNull)
      .vpc(vpc.orNull)
      .storageCapacityGiB(storageCapacityGiB.orNull)
      .removalPolicy(removalPolicy.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
