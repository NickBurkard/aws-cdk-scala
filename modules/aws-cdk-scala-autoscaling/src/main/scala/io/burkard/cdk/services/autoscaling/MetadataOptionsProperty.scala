package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetadataOptionsProperty {

  def apply(
    httpEndpoint: Option[String] = None,
    httpTokens: Option[String] = None,
    httpPutResponseHopLimit: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty.Builder)
      .httpEndpoint(httpEndpoint.orNull)
      .httpTokens(httpTokens.orNull)
      .httpPutResponseHopLimit(httpPutResponseHopLimit.orNull)
      .build()
}
