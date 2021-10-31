package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DockerImageAssetLocation {

  def apply(
    repositoryName: Option[String] = None,
    imageUri: Option[String] = None
  ): software.amazon.awscdk.DockerImageAssetLocation =
    (new software.amazon.awscdk.DockerImageAssetLocation.Builder)
      .repositoryName(repositoryName.orNull)
      .imageUri(imageUri.orNull)
      .build()
}
