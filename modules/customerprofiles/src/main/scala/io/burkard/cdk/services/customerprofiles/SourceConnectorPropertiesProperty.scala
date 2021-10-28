package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SourceConnectorPropertiesProperty {

  def apply(
    s3: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty] = None,
    serviceNow: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty] = None,
    zendesk: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty] = None,
    marketo: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty] = None,
    salesforce: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty.Builder)
      .s3(s3.orNull)
      .serviceNow(serviceNow.orNull)
      .zendesk(zendesk.orNull)
      .marketo(marketo.orNull)
      .salesforce(salesforce.orNull)
      .build()
}
