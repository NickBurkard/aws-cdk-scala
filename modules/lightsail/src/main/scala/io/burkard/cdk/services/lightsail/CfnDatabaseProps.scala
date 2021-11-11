package io.burkard.cdk.services.lightsail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDatabaseProps {

  def apply(
    backupRetention: Option[Boolean] = None,
    rotateMasterUserPassword: Option[Boolean] = None,
    availabilityZone: Option[String] = None,
    masterDatabaseName: Option[String] = None,
    relationalDatabaseParameters: Option[List[_]] = None,
    relationalDatabaseBlueprintId: Option[String] = None,
    publiclyAccessible: Option[Boolean] = None,
    relationalDatabaseBundleId: Option[String] = None,
    relationalDatabaseName: Option[String] = None,
    masterUserPassword: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    caCertificateIdentifier: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    masterUsername: Option[String] = None,
    preferredBackupWindow: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnDatabaseProps =
    (new software.amazon.awscdk.services.lightsail.CfnDatabaseProps.Builder)
      .backupRetention(backupRetention.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .rotateMasterUserPassword(rotateMasterUserPassword.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .availabilityZone(availabilityZone.orNull)
      .masterDatabaseName(masterDatabaseName.orNull)
      .relationalDatabaseParameters(relationalDatabaseParameters.map(_.asJava).orNull)
      .relationalDatabaseBlueprintId(relationalDatabaseBlueprintId.orNull)
      .publiclyAccessible(publiclyAccessible.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .relationalDatabaseBundleId(relationalDatabaseBundleId.orNull)
      .relationalDatabaseName(relationalDatabaseName.orNull)
      .masterUserPassword(masterUserPassword.orNull)
      .tags(tags.map(_.asJava).orNull)
      .caCertificateIdentifier(caCertificateIdentifier.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .masterUsername(masterUsername.orNull)
      .preferredBackupWindow(preferredBackupWindow.orNull)
      .build()
}
