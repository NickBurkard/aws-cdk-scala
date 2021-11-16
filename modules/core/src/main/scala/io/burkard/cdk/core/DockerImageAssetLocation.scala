package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DockerImageAssetLocation {

  def apply(
    repositoryName: String,
    imageUri: String
  ): software.amazon.awscdk.DockerImageAssetLocation =
    (new software.amazon.awscdk.DockerImageAssetLocation.Builder)
      .repositoryName(repositoryName)
      .imageUri(imageUri)
      .build()
}
