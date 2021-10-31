package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVolumeAttachmentProps {

  def apply(
    instanceId: Option[String] = None,
    volumeId: Option[String] = None,
    device: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps =
    (new software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps.Builder)
      .instanceId(instanceId.orNull)
      .volumeId(volumeId.orNull)
      .device(device.orNull)
      .build()
}
