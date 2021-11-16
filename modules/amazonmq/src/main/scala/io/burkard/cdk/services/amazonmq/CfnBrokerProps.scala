package io.burkard.cdk.services.amazonmq

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBrokerProps {

  def apply(
    users: List[_],
    autoMinorVersionUpgrade: Boolean,
    hostInstanceType: String,
    engineType: String,
    engineVersion: String,
    deploymentMode: String,
    brokerName: String,
    publiclyAccessible: Boolean,
    subnetIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty]] = None,
    maintenanceWindowStartTime: Option[software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty] = None,
    authenticationStrategy: Option[String] = None,
    configuration: Option[software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty] = None,
    securityGroups: Option[List[String]] = None,
    ldapServerMetadata: Option[software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty] = None,
    storageType: Option[String] = None,
    encryptionOptions: Option[software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty] = None,
    logs: Option[software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty] = None
  ): software.amazon.awscdk.services.amazonmq.CfnBrokerProps =
    (new software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder)
      .users(users.asJava)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade)
      .hostInstanceType(hostInstanceType)
      .engineType(engineType)
      .engineVersion(engineVersion)
      .deploymentMode(deploymentMode)
      .brokerName(brokerName)
      .publiclyAccessible(publiclyAccessible)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .maintenanceWindowStartTime(maintenanceWindowStartTime.orNull)
      .authenticationStrategy(authenticationStrategy.orNull)
      .configuration(configuration.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .ldapServerMetadata(ldapServerMetadata.orNull)
      .storageType(storageType.orNull)
      .encryptionOptions(encryptionOptions.orNull)
      .logs(logs.orNull)
      .build()
}
