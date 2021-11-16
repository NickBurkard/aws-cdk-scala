package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerlessCluster {

  def apply(
    internalResourceId: String,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    engine: software.amazon.awscdk.services.rds.IClusterEngine,
    subnetGroup: Option[software.amazon.awscdk.services.rds.ISubnetGroup] = None,
    backupRetention: Option[software.amazon.awscdk.Duration] = None,
    enableDataApi: Option[Boolean] = None,
    scaling: Option[software.amazon.awscdk.services.rds.ServerlessScalingOptions] = None,
    deletionProtection: Option[Boolean] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    storageEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    defaultDatabaseName: Option[String] = None,
    clusterIdentifier: Option[String] = None,
    parameterGroup: Option[software.amazon.awscdk.services.rds.IParameterGroup] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    credentials: Option[software.amazon.awscdk.services.rds.Credentials] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.ServerlessCluster =
    software.amazon.awscdk.services.rds.ServerlessCluster.Builder
      .create(stackCtx, internalResourceId)
      .vpc(vpc)
      .engine(engine)
      .subnetGroup(subnetGroup.orNull)
      .backupRetention(backupRetention.orNull)
      .enableDataApi(enableDataApi.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .scaling(scaling.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .storageEncryptionKey(storageEncryptionKey.orNull)
      .defaultDatabaseName(defaultDatabaseName.orNull)
      .clusterIdentifier(clusterIdentifier.orNull)
      .parameterGroup(parameterGroup.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .removalPolicy(removalPolicy.orNull)
      .credentials(credentials.orNull)
      .build()
}
