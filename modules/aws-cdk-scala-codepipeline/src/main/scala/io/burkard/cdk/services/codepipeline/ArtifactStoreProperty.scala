package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ArtifactStoreProperty {

  def apply(
    location: Option[String] = None,
    `type`: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder)
      .location(location.orNull)
      .`type`(`type`.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
