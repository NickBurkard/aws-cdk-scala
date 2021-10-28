package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DockerVolume {

  def apply(
    hostPath: Option[String] = None,
    consistency: Option[software.amazon.awscdk.DockerVolumeConsistency] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.DockerVolume =
    (new software.amazon.awscdk.DockerVolume.Builder)
      .hostPath(hostPath.orNull)
      .consistency(consistency.orNull)
      .containerPath(containerPath.orNull)
      .build()
}
