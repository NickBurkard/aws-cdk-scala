package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseInstanceProps {

  def apply(
    availabilityZone: Option[String] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    cluster: Option[software.amazon.awscdk.services.docdb.IDatabaseCluster] = None,
    dbInstanceName: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    preferredMaintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None
  ): software.amazon.awscdk.services.docdb.DatabaseInstanceProps =
    (new software.amazon.awscdk.services.docdb.DatabaseInstanceProps.Builder)
      .availabilityZone(availabilityZone.orNull)
      .instanceType(instanceType.orNull)
      .cluster(cluster.orNull)
      .dbInstanceName(dbInstanceName.orNull)
      .removalPolicy(removalPolicy.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
