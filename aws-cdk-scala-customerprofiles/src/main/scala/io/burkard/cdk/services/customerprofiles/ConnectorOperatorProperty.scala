package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConnectorOperatorProperty {

  def apply(
    s3: Option[String] = None,
    serviceNow: Option[String] = None,
    zendesk: Option[String] = None,
    marketo: Option[String] = None,
    salesforce: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty.Builder)
      .s3(s3.orNull)
      .serviceNow(serviceNow.orNull)
      .zendesk(zendesk.orNull)
      .marketo(marketo.orNull)
      .salesforce(salesforce.orNull)
      .build()
}
