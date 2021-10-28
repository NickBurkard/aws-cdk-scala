package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AclConfigurationProperty {

  def apply(
    allowedGroupsColumnName: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty.Builder)
      .allowedGroupsColumnName(allowedGroupsColumnName.orNull)
      .build()
}
