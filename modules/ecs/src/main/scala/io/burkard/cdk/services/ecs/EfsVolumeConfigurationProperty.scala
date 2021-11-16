package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EfsVolumeConfigurationProperty {

  def apply(
    fileSystemId: String,
    authorizationConfig: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty] = None,
    transitEncryption: Option[String] = None,
    transitEncryptionPort: Option[Number] = None,
    rootDirectory: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.EfsVolumeConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.EfsVolumeConfigurationProperty.Builder)
      .fileSystemId(fileSystemId)
      .authorizationConfig(authorizationConfig.orNull)
      .transitEncryption(transitEncryption.orNull)
      .transitEncryptionPort(transitEncryptionPort.orNull)
      .rootDirectory(rootDirectory.orNull)
      .build()
}
