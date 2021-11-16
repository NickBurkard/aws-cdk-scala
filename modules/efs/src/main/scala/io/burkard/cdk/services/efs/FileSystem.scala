package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileSystem {

  def apply(
    internalResourceId: String,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    enableAutomaticBackups: Option[Boolean] = None,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    lifecyclePolicy: Option[software.amazon.awscdk.services.efs.LifecyclePolicy] = None,
    provisionedThroughputPerSecond: Option[software.amazon.awscdk.Size] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    performanceMode: Option[software.amazon.awscdk.services.efs.PerformanceMode] = None,
    encrypted: Option[Boolean] = None,
    fileSystemName: Option[String] = None,
    throughputMode: Option[software.amazon.awscdk.services.efs.ThroughputMode] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.efs.FileSystem =
    software.amazon.awscdk.services.efs.FileSystem.Builder
      .create(stackCtx, internalResourceId)
      .vpc(vpc)
      .enableAutomaticBackups(enableAutomaticBackups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kmsKey(kmsKey.orNull)
      .lifecyclePolicy(lifecyclePolicy.orNull)
      .provisionedThroughputPerSecond(provisionedThroughputPerSecond.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .performanceMode(performanceMode.orNull)
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .fileSystemName(fileSystemName.orNull)
      .throughputMode(throughputMode.orNull)
      .removalPolicy(removalPolicy.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
