package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceConnectorPropertiesProperty {

  def apply(
    amplitude: Option[software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty] = None,
    s3: Option[software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty] = None,
    serviceNow: Option[software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty] = None,
    zendesk: Option[software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty] = None,
    singular: Option[software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty] = None,
    googleAnalytics: Option[software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty] = None,
    marketo: Option[software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty] = None,
    inforNexus: Option[software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty] = None,
    salesforce: Option[software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty] = None,
    datadog: Option[software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty] = None,
    trendmicro: Option[software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty] = None,
    sapoData: Option[software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty] = None,
    slack: Option[software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty] = None,
    veeva: Option[software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty] = None,
    dynatrace: Option[software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty.Builder)
      .amplitude(amplitude.orNull)
      .s3(s3.orNull)
      .serviceNow(serviceNow.orNull)
      .zendesk(zendesk.orNull)
      .singular(singular.orNull)
      .googleAnalytics(googleAnalytics.orNull)
      .marketo(marketo.orNull)
      .inforNexus(inforNexus.orNull)
      .salesforce(salesforce.orNull)
      .datadog(datadog.orNull)
      .trendmicro(trendmicro.orNull)
      .sapoData(sapoData.orNull)
      .slack(slack.orNull)
      .veeva(veeva.orNull)
      .dynatrace(dynatrace.orNull)
      .build()
}
