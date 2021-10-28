package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DockerImageAssetInvalidationOptions {

  def apply(
    extraHash: Option[Boolean] = None,
    repositoryName: Option[Boolean] = None,
    buildArgs: Option[Boolean] = None,
    file: Option[Boolean] = None,
    target: Option[Boolean] = None
  ): software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions =
    (new software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions.Builder)
      .extraHash(extraHash.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .repositoryName(repositoryName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .buildArgs(buildArgs.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .file(file.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .target(target.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
