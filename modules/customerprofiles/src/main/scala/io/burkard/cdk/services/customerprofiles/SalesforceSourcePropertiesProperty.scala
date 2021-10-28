package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SalesforceSourcePropertiesProperty {

  def apply(
    includeDeletedRecords: Option[Boolean] = None,
    enableDynamicFieldUpdate: Option[Boolean] = None,
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty.Builder)
      .includeDeletedRecords(includeDeletedRecords.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enableDynamicFieldUpdate(enableDynamicFieldUpdate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .`object`(`object`.orNull)
      .build()
}
