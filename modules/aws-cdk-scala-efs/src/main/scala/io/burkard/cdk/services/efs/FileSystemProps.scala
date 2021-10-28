package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileSystemProps {

  def apply(
    enableAutomaticBackups: Option[Boolean] = None,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    lifecyclePolicy: Option[software.amazon.awscdk.services.efs.LifecyclePolicy] = None,
    provisionedThroughputPerSecond: Option[software.amazon.awscdk.Size] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    performanceMode: Option[software.amazon.awscdk.services.efs.PerformanceMode] = None,
    encrypted: Option[Boolean] = None,
    fileSystemName: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    throughputMode: Option[software.amazon.awscdk.services.efs.ThroughputMode] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.efs.FileSystemProps =
    (new software.amazon.awscdk.services.efs.FileSystemProps.Builder)
      .enableAutomaticBackups(enableAutomaticBackups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kmsKey(kmsKey.orNull)
      .lifecyclePolicy(lifecyclePolicy.orNull)
      .provisionedThroughputPerSecond(provisionedThroughputPerSecond.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .performanceMode(performanceMode.orNull)
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .fileSystemName(fileSystemName.orNull)
      .vpc(vpc.orNull)
      .throughputMode(throughputMode.orNull)
      .removalPolicy(removalPolicy.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
