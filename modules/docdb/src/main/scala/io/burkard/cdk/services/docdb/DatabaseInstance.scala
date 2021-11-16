package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseInstance {

  def apply(
    internalResourceId: String,
    instanceType: software.amazon.awscdk.services.ec2.InstanceType,
    cluster: software.amazon.awscdk.services.docdb.IDatabaseCluster,
    availabilityZone: Option[String] = None,
    dbInstanceName: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    preferredMaintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.docdb.DatabaseInstance =
    software.amazon.awscdk.services.docdb.DatabaseInstance.Builder
      .create(stackCtx, internalResourceId)
      .instanceType(instanceType)
      .cluster(cluster)
      .availabilityZone(availabilityZone.orNull)
      .dbInstanceName(dbInstanceName.orNull)
      .removalPolicy(removalPolicy.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
