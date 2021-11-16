package io.burkard.cdk.services.opsworkscm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServer {

  def apply(
    internalResourceId: String,
    instanceType: String,
    instanceProfileArn: String,
    serviceRoleArn: String,
    subnetIds: Option[List[String]] = None,
    keyPair: Option[String] = None,
    disableAutomatedBackup: Option[Boolean] = None,
    customDomain: Option[String] = None,
    associatePublicIpAddress: Option[Boolean] = None,
    customCertificate: Option[String] = None,
    backupRetentionCount: Option[Number] = None,
    engineAttributes: Option[List[_]] = None,
    preferredBackupWindow: Option[String] = None,
    engineVersion: Option[String] = None,
    engine: Option[String] = None,
    serverName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    customPrivateKey: Option[String] = None,
    backupId: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    preferredMaintenanceWindow: Option[String] = None,
    engineModel: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.opsworkscm.CfnServer =
    software.amazon.awscdk.services.opsworkscm.CfnServer.Builder
      .create(stackCtx, internalResourceId)
      .instanceType(instanceType)
      .instanceProfileArn(instanceProfileArn)
      .serviceRoleArn(serviceRoleArn)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .keyPair(keyPair.orNull)
      .disableAutomatedBackup(disableAutomatedBackup.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .customDomain(customDomain.orNull)
      .associatePublicIpAddress(associatePublicIpAddress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .customCertificate(customCertificate.orNull)
      .backupRetentionCount(backupRetentionCount.orNull)
      .engineAttributes(engineAttributes.map(_.asJava).orNull)
      .preferredBackupWindow(preferredBackupWindow.orNull)
      .engineVersion(engineVersion.orNull)
      .engine(engine.orNull)
      .serverName(serverName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .customPrivateKey(customPrivateKey.orNull)
      .backupId(backupId.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .engineModel(engineModel.orNull)
      .build()
}
