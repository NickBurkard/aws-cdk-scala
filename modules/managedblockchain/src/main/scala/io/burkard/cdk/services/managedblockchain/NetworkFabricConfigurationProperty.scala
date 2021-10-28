package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkFabricConfigurationProperty {

  def apply(
    edition: Option[String] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty.Builder)
      .edition(edition.orNull)
      .build()
}
