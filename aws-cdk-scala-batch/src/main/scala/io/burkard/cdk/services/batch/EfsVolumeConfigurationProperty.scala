package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EfsVolumeConfigurationProperty {

  def apply(
    authorizationConfig: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty] = None,
    transitEncryption: Option[String] = None,
    transitEncryptionPort: Option[Number] = None,
    rootDirectory: Option[String] = None,
    fileSystemId: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty.Builder)
      .authorizationConfig(authorizationConfig.orNull)
      .transitEncryption(transitEncryption.orNull)
      .transitEncryptionPort(transitEncryptionPort.orNull)
      .rootDirectory(rootDirectory.orNull)
      .fileSystemId(fileSystemId.orNull)
      .build()
}
