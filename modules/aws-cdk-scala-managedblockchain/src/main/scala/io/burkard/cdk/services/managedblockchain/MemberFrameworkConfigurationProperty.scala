package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MemberFrameworkConfigurationProperty {

  def apply(
    memberFabricConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty.Builder)
      .memberFabricConfiguration(memberFabricConfiguration.orNull)
      .build()
}
