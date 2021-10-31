package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectorProfilePropertiesProperty {

  def apply(
    serviceNow: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty] = None,
    zendesk: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty] = None,
    datadog: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty] = None,
    slack: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty] = None,
    marketo: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty] = None,
    inforNexus: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty] = None,
    redshift: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty] = None,
    veeva: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty] = None,
    dynatrace: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty] = None,
    salesforce: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty] = None,
    snowflake: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty.Builder)
      .serviceNow(serviceNow.orNull)
      .zendesk(zendesk.orNull)
      .datadog(datadog.orNull)
      .slack(slack.orNull)
      .marketo(marketo.orNull)
      .inforNexus(inforNexus.orNull)
      .redshift(redshift.orNull)
      .veeva(veeva.orNull)
      .dynatrace(dynatrace.orNull)
      .salesforce(salesforce.orNull)
      .snowflake(snowflake.orNull)
      .build()
}
