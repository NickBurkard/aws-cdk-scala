package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNodeProps {

  def apply(
    networkId: Option[String] = None,
    nodeConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty] = None,
    memberId: Option[String] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnNodeProps =
    (new software.amazon.awscdk.services.managedblockchain.CfnNodeProps.Builder)
      .networkId(networkId.orNull)
      .nodeConfiguration(nodeConfiguration.orNull)
      .memberId(memberId.orNull)
      .build()
}
