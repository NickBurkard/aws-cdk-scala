package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArtifactStoreProperty {

  def apply(
    location: String,
    `type`: String,
    encryptionKey: Option[software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder)
      .location(location)
      .`type`(`type`)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
