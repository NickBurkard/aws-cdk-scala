package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SalesforceSourcePropertiesProperty {

  def apply(
    `object`: String,
    includeDeletedRecords: Option[Boolean] = None,
    enableDynamicFieldUpdate: Option[Boolean] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty.Builder)
      .`object`(`object`)
      .includeDeletedRecords(includeDeletedRecords.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enableDynamicFieldUpdate(enableDynamicFieldUpdate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
