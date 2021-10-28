package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EfsVolumeConfiguration {

  def apply(
    authorizationConfig: Option[software.amazon.awscdk.services.ecs.AuthorizationConfig] = None,
    transitEncryption: Option[String] = None,
    transitEncryptionPort: Option[Number] = None,
    rootDirectory: Option[String] = None,
    fileSystemId: Option[String] = None
  ): software.amazon.awscdk.services.ecs.EfsVolumeConfiguration =
    (new software.amazon.awscdk.services.ecs.EfsVolumeConfiguration.Builder)
      .authorizationConfig(authorizationConfig.orNull)
      .transitEncryption(transitEncryption.orNull)
      .transitEncryptionPort(transitEncryptionPort.orNull)
      .rootDirectory(rootDirectory.orNull)
      .fileSystemId(fileSystemId.orNull)
      .build()
}
