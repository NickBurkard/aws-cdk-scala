package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DestinationConnectorPropertiesProperty {

  def apply(
    lookoutMetrics: Option[software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty] = None,
    s3: Option[software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty] = None,
    upsolver: Option[software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty] = None,
    eventBridge: Option[software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty] = None,
    zendesk: Option[software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty] = None,
    redshift: Option[software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty] = None,
    salesforce: Option[software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty] = None,
    snowflake: Option[software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty.Builder)
      .lookoutMetrics(lookoutMetrics.orNull)
      .s3(s3.orNull)
      .upsolver(upsolver.orNull)
      .eventBridge(eventBridge.orNull)
      .zendesk(zendesk.orNull)
      .redshift(redshift.orNull)
      .salesforce(salesforce.orNull)
      .snowflake(snowflake.orNull)
      .build()
}
