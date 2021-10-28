package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetadataOptionsProperty {

  def apply(
    httpProtocolIpv6: Option[String] = None,
    httpEndpoint: Option[String] = None,
    httpTokens: Option[String] = None,
    httpPutResponseHopLimit: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty.Builder)
      .httpProtocolIpv6(httpProtocolIpv6.orNull)
      .httpEndpoint(httpEndpoint.orNull)
      .httpTokens(httpTokens.orNull)
      .httpPutResponseHopLimit(httpPutResponseHopLimit.orNull)
      .build()
}
