package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectorProfileCredentialsProperty {

  def apply(
    amplitude: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty] = None,
    serviceNow: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty] = None,
    zendesk: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty] = None,
    singular: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty] = None,
    googleAnalytics: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty] = None,
    marketo: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty] = None,
    inforNexus: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty] = None,
    redshift: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty] = None,
    datadog: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty] = None,
    trendmicro: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty] = None,
    sapoData: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty] = None,
    slack: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty] = None,
    veeva: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty] = None,
    dynatrace: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty] = None,
    salesforce: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty] = None,
    snowflake: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty.Builder)
      .amplitude(amplitude.orNull)
      .serviceNow(serviceNow.orNull)
      .zendesk(zendesk.orNull)
      .singular(singular.orNull)
      .googleAnalytics(googleAnalytics.orNull)
      .marketo(marketo.orNull)
      .inforNexus(inforNexus.orNull)
      .redshift(redshift.orNull)
      .datadog(datadog.orNull)
      .trendmicro(trendmicro.orNull)
      .sapoData(sapoData.orNull)
      .slack(slack.orNull)
      .veeva(veeva.orNull)
      .dynatrace(dynatrace.orNull)
      .salesforce(salesforce.orNull)
      .snowflake(snowflake.orNull)
      .build()
}
