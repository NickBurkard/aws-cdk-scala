package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileSystemProps {

  def apply(
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    storageCapacityGiB: Number,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    backupId: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.fsx.FileSystemProps =
    (new software.amazon.awscdk.services.fsx.FileSystemProps.Builder)
      .vpc(vpc)
      .storageCapacityGiB(storageCapacityGiB)
      .kmsKey(kmsKey.orNull)
      .backupId(backupId.orNull)
      .removalPolicy(removalPolicy.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
