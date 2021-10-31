package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SalesforceSourcePropertiesProperty {

  def apply(
    includeDeletedRecords: Option[Boolean] = None,
    enableDynamicFieldUpdate: Option[Boolean] = None,
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty.Builder)
      .includeDeletedRecords(includeDeletedRecords.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enableDynamicFieldUpdate(enableDynamicFieldUpdate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .`object`(`object`.orNull)
      .build()
}
