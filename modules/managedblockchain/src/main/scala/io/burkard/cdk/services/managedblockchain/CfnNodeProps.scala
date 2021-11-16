package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNodeProps {

  def apply(
    networkId: String,
    nodeConfiguration: software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty,
    memberId: Option[String] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnNodeProps =
    (new software.amazon.awscdk.services.managedblockchain.CfnNodeProps.Builder)
      .networkId(networkId)
      .nodeConfiguration(nodeConfiguration)
      .memberId(memberId.orNull)
      .build()
}
