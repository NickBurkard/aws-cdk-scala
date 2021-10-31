package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LustreFileSystemProps {

  def apply(
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    vpcSubnet: Option[software.amazon.awscdk.services.ec2.ISubnet] = None,
    backupId: Option[String] = None,
    lustreConfiguration: Option[software.amazon.awscdk.services.fsx.LustreConfiguration] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    storageCapacityGiB: Option[Number] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.fsx.LustreFileSystemProps =
    (new software.amazon.awscdk.services.fsx.LustreFileSystemProps.Builder)
      .kmsKey(kmsKey.orNull)
      .vpcSubnet(vpcSubnet.orNull)
      .backupId(backupId.orNull)
      .lustreConfiguration(lustreConfiguration.orNull)
      .vpc(vpc.orNull)
      .storageCapacityGiB(storageCapacityGiB.orNull)
      .removalPolicy(removalPolicy.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
