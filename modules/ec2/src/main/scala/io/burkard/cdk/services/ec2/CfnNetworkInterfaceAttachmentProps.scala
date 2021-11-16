package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkInterfaceAttachmentProps {

  def apply(
    instanceId: String,
    deviceIndex: String,
    networkInterfaceId: String,
    deleteOnTermination: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps.Builder)
      .instanceId(instanceId)
      .deviceIndex(deviceIndex)
      .networkInterfaceId(networkInterfaceId)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
