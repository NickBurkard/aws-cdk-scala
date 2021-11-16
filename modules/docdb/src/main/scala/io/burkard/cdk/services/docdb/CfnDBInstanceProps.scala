package io.burkard.cdk.services.docdb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBInstanceProps {

  def apply(
    dbInstanceClass: String,
    dbClusterIdentifier: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    availabilityZone: Option[String] = None,
    dbInstanceIdentifier: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None
  ): software.amazon.awscdk.services.docdb.CfnDBInstanceProps =
    (new software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder)
      .dbInstanceClass(dbInstanceClass)
      .dbClusterIdentifier(dbClusterIdentifier)
      .tags(tags.map(_.asJava).orNull)
      .availabilityZone(availabilityZone.orNull)
      .dbInstanceIdentifier(dbInstanceIdentifier.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
