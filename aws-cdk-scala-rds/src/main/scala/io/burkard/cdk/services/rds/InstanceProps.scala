package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceProps {

  def apply(
    performanceInsightEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    allowMajorVersionUpgrade: Option[Boolean] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    publiclyAccessible: Option[Boolean] = None,
    enablePerformanceInsights: Option[Boolean] = None,
    parameterGroup: Option[software.amazon.awscdk.services.rds.IParameterGroup] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    deleteAutomatedBackups: Option[Boolean] = None,
    performanceInsightRetention: Option[software.amazon.awscdk.services.rds.PerformanceInsightRetention] = None
  ): software.amazon.awscdk.services.rds.InstanceProps =
    (new software.amazon.awscdk.services.rds.InstanceProps.Builder)
      .performanceInsightEncryptionKey(performanceInsightEncryptionKey.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceType(instanceType.orNull)
      .allowMajorVersionUpgrade(allowMajorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .publiclyAccessible(publiclyAccessible.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enablePerformanceInsights(enablePerformanceInsights.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .parameterGroup(parameterGroup.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .deleteAutomatedBackups(deleteAutomatedBackups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .performanceInsightRetention(performanceInsightRetention.orNull)
      .build()
}
