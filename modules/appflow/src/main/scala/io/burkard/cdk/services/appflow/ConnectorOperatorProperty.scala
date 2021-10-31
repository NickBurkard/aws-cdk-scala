package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectorOperatorProperty {

  def apply(
    amplitude: Option[String] = None,
    s3: Option[String] = None,
    serviceNow: Option[String] = None,
    zendesk: Option[String] = None,
    singular: Option[String] = None,
    slack: Option[String] = None,
    googleAnalytics: Option[String] = None,
    marketo: Option[String] = None,
    inforNexus: Option[String] = None,
    salesforce: Option[String] = None,
    datadog: Option[String] = None,
    trendmicro: Option[String] = None,
    veeva: Option[String] = None,
    dynatrace: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty.Builder)
      .amplitude(amplitude.orNull)
      .s3(s3.orNull)
      .serviceNow(serviceNow.orNull)
      .zendesk(zendesk.orNull)
      .singular(singular.orNull)
      .slack(slack.orNull)
      .googleAnalytics(googleAnalytics.orNull)
      .marketo(marketo.orNull)
      .inforNexus(inforNexus.orNull)
      .salesforce(salesforce.orNull)
      .datadog(datadog.orNull)
      .trendmicro(trendmicro.orNull)
      .veeva(veeva.orNull)
      .dynatrace(dynatrace.orNull)
      .build()
}
