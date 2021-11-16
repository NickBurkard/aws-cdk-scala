package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NodeConfigurationProperty {

  def apply(
    availabilityZone: String,
    instanceType: String
  ): software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty.Builder)
      .availabilityZone(availabilityZone)
      .instanceType(instanceType)
      .build()
}
