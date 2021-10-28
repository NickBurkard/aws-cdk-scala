package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ElasticsearchSettingsProperty {

  def apply(
    endpointUri: Option[String] = None,
    serviceAccessRoleArn: Option[String] = None,
    fullLoadErrorPercentage: Option[Number] = None,
    errorRetryDuration: Option[Number] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder)
      .endpointUri(endpointUri.orNull)
      .serviceAccessRoleArn(serviceAccessRoleArn.orNull)
      .fullLoadErrorPercentage(fullLoadErrorPercentage.orNull)
      .errorRetryDuration(errorRetryDuration.orNull)
      .build()
}
