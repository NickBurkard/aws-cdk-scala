package io.burkard.cdk.services.amazonmq

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBroker {

  def apply(
    internalResourceId: String,
    subnetIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty]] = None,
    users: Option[List[_]] = None,
    maintenanceWindowStartTime: Option[software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None,
    authenticationStrategy: Option[String] = None,
    configuration: Option[software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty] = None,
    securityGroups: Option[List[String]] = None,
    hostInstanceType: Option[String] = None,
    ldapServerMetadata: Option[software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty] = None,
    engineType: Option[String] = None,
    engineVersion: Option[String] = None,
    deploymentMode: Option[String] = None,
    storageType: Option[String] = None,
    brokerName: Option[String] = None,
    encryptionOptions: Option[software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty] = None,
    publiclyAccessible: Option[Boolean] = None,
    logs: Option[software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.amazonmq.CfnBroker =
    software.amazon.awscdk.services.amazonmq.CfnBroker.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .users(users.map(_.asJava).orNull)
      .maintenanceWindowStartTime(maintenanceWindowStartTime.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .authenticationStrategy(authenticationStrategy.orNull)
      .configuration(configuration.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .hostInstanceType(hostInstanceType.orNull)
      .ldapServerMetadata(ldapServerMetadata.orNull)
      .engineType(engineType.orNull)
      .engineVersion(engineVersion.orNull)
      .deploymentMode(deploymentMode.orNull)
      .storageType(storageType.orNull)
      .brokerName(brokerName.orNull)
      .encryptionOptions(encryptionOptions.orNull)
      .publiclyAccessible(publiclyAccessible.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .logs(logs.orNull)
      .build()
}
