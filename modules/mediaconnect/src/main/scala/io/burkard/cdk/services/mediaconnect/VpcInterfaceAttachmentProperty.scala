package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcInterfaceAttachmentProperty {

  def apply(
    vpcInterfaceName: Option[String] = None
  ): software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty =
    (new software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty.Builder)
      .vpcInterfaceName(vpcInterfaceName.orNull)
      .build()
}
