package io.burkard.cdk.pipelines

sealed abstract class DockerCredentialUsage(val underlying: software.amazon.awscdk.pipelines.DockerCredentialUsage)
  extends Product
    with Serializable

object DockerCredentialUsage {
  implicit def toAws(value: DockerCredentialUsage): software.amazon.awscdk.pipelines.DockerCredentialUsage =
    Option(value).map(_.underlying).orNull

  case object Synth
    extends DockerCredentialUsage(software.amazon.awscdk.pipelines.DockerCredentialUsage.SYNTH)

  case object SelfUpdate
    extends DockerCredentialUsage(software.amazon.awscdk.pipelines.DockerCredentialUsage.SELF_UPDATE)

  case object AssetPublishing
    extends DockerCredentialUsage(software.amazon.awscdk.pipelines.DockerCredentialUsage.ASSET_PUBLISHING)
}
