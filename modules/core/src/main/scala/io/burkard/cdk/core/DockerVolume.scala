package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DockerVolume {

  def apply(
    hostPath: String,
    containerPath: String,
    consistency: Option[software.amazon.awscdk.DockerVolumeConsistency] = None
  ): software.amazon.awscdk.DockerVolume =
    (new software.amazon.awscdk.DockerVolume.Builder)
      .hostPath(hostPath)
      .containerPath(containerPath)
      .consistency(consistency.orNull)
      .build()
}
