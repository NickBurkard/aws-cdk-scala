package io.burkard.cdk.services.neptune

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBInstance {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.neptune.CfnDBInstance =
    software.amazon.awscdk.services.neptune.CfnDBInstance.Builder
      .create(stackCtx, internalResourceId)
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
