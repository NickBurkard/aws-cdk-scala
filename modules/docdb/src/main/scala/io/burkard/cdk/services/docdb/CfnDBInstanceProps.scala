package io.burkard.cdk.services.docdb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBInstanceProps {

  def apply(
    dbInstanceClass: Option[String] = None,
    dbClusterIdentifier: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    availabilityZone: Option[String] = None,
    dbInstanceIdentifier: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None
  ): software.amazon.awscdk.services.docdb.CfnDBInstanceProps =
    (new software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder)
      .dbInstanceClass(dbInstanceClass.orNull)
      .dbClusterIdentifier(dbClusterIdentifier.orNull)
      .tags(tags.map(_.asJava).orNull)
      .availabilityZone(availabilityZone.orNull)
      .dbInstanceIdentifier(dbInstanceIdentifier.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
