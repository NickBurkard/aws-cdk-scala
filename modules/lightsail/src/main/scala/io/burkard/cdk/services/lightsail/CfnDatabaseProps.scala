package io.burkard.cdk.services.lightsail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDatabaseProps {

  def apply(
    masterDatabaseName: String,
    relationalDatabaseBlueprintId: String,
    relationalDatabaseBundleId: String,
    relationalDatabaseName: String,
    masterUsername: String,
    backupRetention: Option[Boolean] = None,
    rotateMasterUserPassword: Option[Boolean] = None,
    availabilityZone: Option[String] = None,
    relationalDatabaseParameters: Option[List[_]] = None,
    publiclyAccessible: Option[Boolean] = None,
    masterUserPassword: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    caCertificateIdentifier: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    preferredBackupWindow: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnDatabaseProps =
    (new software.amazon.awscdk.services.lightsail.CfnDatabaseProps.Builder)
      .masterDatabaseName(masterDatabaseName)
      .relationalDatabaseBlueprintId(relationalDatabaseBlueprintId)
      .relationalDatabaseBundleId(relationalDatabaseBundleId)
      .relationalDatabaseName(relationalDatabaseName)
      .masterUsername(masterUsername)
      .backupRetention(backupRetention.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .rotateMasterUserPassword(rotateMasterUserPassword.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .availabilityZone(availabilityZone.orNull)
      .relationalDatabaseParameters(relationalDatabaseParameters.map(_.asJava).orNull)
      .publiclyAccessible(publiclyAccessible.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .masterUserPassword(masterUserPassword.orNull)
      .tags(tags.map(_.asJava).orNull)
      .caCertificateIdentifier(caCertificateIdentifier.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .preferredBackupWindow(preferredBackupWindow.orNull)
      .build()
}
