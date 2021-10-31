package io.burkard.cdk.services.opsworkscm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServer {

  def apply(
    internalResourceId: String,
    subnetIds: Option[List[String]] = None,
    keyPair: Option[String] = None,
    disableAutomatedBackup: Option[Boolean] = None,
    customDomain: Option[String] = None,
    instanceType: Option[String] = None,
    associatePublicIpAddress: Option[Boolean] = None,
    customCertificate: Option[String] = None,
    instanceProfileArn: Option[String] = None,
    backupRetentionCount: Option[Number] = None,
    engineAttributes: Option[List[_]] = None,
    preferredBackupWindow: Option[String] = None,
    engineVersion: Option[String] = None,
    engine: Option[String] = None,
    serverName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    customPrivateKey: Option[String] = None,
    backupId: Option[String] = None,
    serviceRoleArn: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    preferredMaintenanceWindow: Option[String] = None,
    engineModel: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.opsworkscm.CfnServer =
    software.amazon.awscdk.services.opsworkscm.CfnServer.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .keyPair(keyPair.orNull)
      .disableAutomatedBackup(disableAutomatedBackup.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .customDomain(customDomain.orNull)
      .instanceType(instanceType.orNull)
      .associatePublicIpAddress(associatePublicIpAddress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .customCertificate(customCertificate.orNull)
      .instanceProfileArn(instanceProfileArn.orNull)
      .backupRetentionCount(backupRetentionCount.orNull)
      .engineAttributes(engineAttributes.map(_.asJava).orNull)
      .preferredBackupWindow(preferredBackupWindow.orNull)
      .engineVersion(engineVersion.orNull)
      .engine(engine.orNull)
      .serverName(serverName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .customPrivateKey(customPrivateKey.orNull)
      .backupId(backupId.orNull)
      .serviceRoleArn(serviceRoleArn.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .engineModel(engineModel.orNull)
      .build()
}
