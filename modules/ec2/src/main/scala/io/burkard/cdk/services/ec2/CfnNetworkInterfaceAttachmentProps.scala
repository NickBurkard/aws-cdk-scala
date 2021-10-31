package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkInterfaceAttachmentProps {

  def apply(
    instanceId: Option[String] = None,
    deviceIndex: Option[String] = None,
    deleteOnTermination: Option[Boolean] = None,
    networkInterfaceId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps.Builder)
      .instanceId(instanceId.orNull)
      .deviceIndex(deviceIndex.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .networkInterfaceId(networkInterfaceId.orNull)
      .build()
}
