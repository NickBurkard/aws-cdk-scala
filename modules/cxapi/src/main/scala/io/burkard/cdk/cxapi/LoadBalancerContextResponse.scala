package io.burkard.cdk.cxapi

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoadBalancerContextResponse {

  def apply(
    loadBalancerDnsName: Option[String] = None,
    loadBalancerArn: Option[String] = None,
    vpcId: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    ipAddressType: Option[software.amazon.awscdk.cxapi.LoadBalancerIpAddressType] = None,
    loadBalancerCanonicalHostedZoneId: Option[String] = None
  ): software.amazon.awscdk.cxapi.LoadBalancerContextResponse =
    (new software.amazon.awscdk.cxapi.LoadBalancerContextResponse.Builder)
      .loadBalancerDnsName(loadBalancerDnsName.orNull)
      .loadBalancerArn(loadBalancerArn.orNull)
      .vpcId(vpcId.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .ipAddressType(ipAddressType.orNull)
      .loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId.orNull)
      .build()
}
