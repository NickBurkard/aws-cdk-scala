package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AclConfigurationProperty {

  def apply(
    allowedGroupsColumnName: String
  ): software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty.Builder)
      .allowedGroupsColumnName(allowedGroupsColumnName)
      .build()
}
