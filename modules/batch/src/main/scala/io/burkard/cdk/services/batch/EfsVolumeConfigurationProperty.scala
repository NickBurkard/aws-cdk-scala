package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EfsVolumeConfigurationProperty {

  def apply(
    fileSystemId: String,
    authorizationConfig: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty] = None,
    transitEncryption: Option[String] = None,
    transitEncryptionPort: Option[Number] = None,
    rootDirectory: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty.Builder)
      .fileSystemId(fileSystemId)
      .authorizationConfig(authorizationConfig.orNull)
      .transitEncryption(transitEncryption.orNull)
      .transitEncryptionPort(transitEncryptionPort.orNull)
      .rootDirectory(rootDirectory.orNull)
      .build()
}
