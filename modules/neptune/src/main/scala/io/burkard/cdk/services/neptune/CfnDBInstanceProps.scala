package io.burkard.cdk.services.neptune

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBInstanceProps {

  def apply(
    dbInstanceClass: Option[String] = None,
    dbParameterGroupName: Option[String] = None,
    dbClusterIdentifier: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    allowMajorVersionUpgrade: Option[Boolean] = None,
    dbInstanceIdentifier: Option[String] = None,
    dbSubnetGroupName: Option[String] = None,
    availabilityZone: Option[String] = None,
    dbSnapshotIdentifier: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None
  ): software.amazon.awscdk.services.neptune.CfnDBInstanceProps =
    (new software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder)
      .dbInstanceClass(dbInstanceClass.orNull)
      .dbParameterGroupName(dbParameterGroupName.orNull)
      .dbClusterIdentifier(dbClusterIdentifier.orNull)
      .tags(tags.map(_.asJava).orNull)
      .allowMajorVersionUpgrade(allowMajorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dbInstanceIdentifier(dbInstanceIdentifier.orNull)
      .dbSubnetGroupName(dbSubnetGroupName.orNull)
      .availabilityZone(availabilityZone.orNull)
      .dbSnapshotIdentifier(dbSnapshotIdentifier.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
