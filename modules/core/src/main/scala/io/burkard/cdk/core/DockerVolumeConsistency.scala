package io.burkard.cdk.core

sealed abstract class DockerVolumeConsistency(val underlying: software.amazon.awscdk.DockerVolumeConsistency)
  extends Product
    with Serializable

object DockerVolumeConsistency {
  implicit def toAws(value: DockerVolumeConsistency): software.amazon.awscdk.DockerVolumeConsistency =
    Option(value).map(_.underlying).orNull

  case object Cached
    extends DockerVolumeConsistency(software.amazon.awscdk.DockerVolumeConsistency.CACHED)

  case object Consistent
    extends DockerVolumeConsistency(software.amazon.awscdk.DockerVolumeConsistency.CONSISTENT)

  case object Delegated
    extends DockerVolumeConsistency(software.amazon.awscdk.DockerVolumeConsistency.DELEGATED)
}
