package io.burkard.cdk.services.dms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReplicationInstanceProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    availabilityZone: Option[String] = None,
    replicationInstanceClass: Option[String] = None,
    replicationSubnetGroupIdentifier: Option[String] = None,
    kmsKeyId: Option[String] = None,
    publiclyAccessible: Option[Boolean] = None,
    engineVersion: Option[String] = None,
    vpcSecurityGroupIds: Option[List[String]] = None,
    multiAz: Option[Boolean] = None,
    preferredMaintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None,
    allocatedStorage: Option[Number] = None,
    allowMajorVersionUpgrade: Option[Boolean] = None,
    resourceIdentifier: Option[String] = None,
    replicationInstanceIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnReplicationInstanceProps =
    (new software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .availabilityZone(availabilityZone.orNull)
      .replicationInstanceClass(replicationInstanceClass.orNull)
      .replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .publiclyAccessible(publiclyAccessible.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .engineVersion(engineVersion.orNull)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .multiAz(multiAz.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allocatedStorage(allocatedStorage.orNull)
      .allowMajorVersionUpgrade(allowMajorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resourceIdentifier(resourceIdentifier.orNull)
      .replicationInstanceIdentifier(replicationInstanceIdentifier.orNull)
      .build()
}
