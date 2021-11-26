package io.burkard.cdk.services.codebuild

sealed abstract class LocalCacheMode(val underlying: software.amazon.awscdk.services.codebuild.LocalCacheMode)
  extends Product
    with Serializable

object LocalCacheMode {
  implicit def toAws(value: LocalCacheMode): software.amazon.awscdk.services.codebuild.LocalCacheMode =
    Option(value).map(_.underlying).orNull

  case object Custom
    extends LocalCacheMode(software.amazon.awscdk.services.codebuild.LocalCacheMode.CUSTOM)

  case object DockerLayer
    extends LocalCacheMode(software.amazon.awscdk.services.codebuild.LocalCacheMode.DOCKER_LAYER)

  case object Source
    extends LocalCacheMode(software.amazon.awscdk.services.codebuild.LocalCacheMode.SOURCE)
}
