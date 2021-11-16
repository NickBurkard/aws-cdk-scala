package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LustreFileSystemProps {

  def apply(
    vpcSubnet: software.amazon.awscdk.services.ec2.ISubnet,
    lustreConfiguration: software.amazon.awscdk.services.fsx.LustreConfiguration,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    backupId: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    storageCapacityGiB: Option[Number] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.fsx.LustreFileSystemProps =
    (new software.amazon.awscdk.services.fsx.LustreFileSystemProps.Builder)
      .vpcSubnet(vpcSubnet)
      .lustreConfiguration(lustreConfiguration)
      .kmsKey(kmsKey.orNull)
      .backupId(backupId.orNull)
      .vpc(vpc.orNull)
      .storageCapacityGiB(storageCapacityGiB.orNull)
      .removalPolicy(removalPolicy.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
