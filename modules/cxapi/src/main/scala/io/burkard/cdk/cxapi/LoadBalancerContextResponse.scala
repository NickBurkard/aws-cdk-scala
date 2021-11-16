package io.burkard.cdk.cxapi

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancerContextResponse {

  def apply(
    loadBalancerDnsName: String,
    loadBalancerArn: String,
    vpcId: String,
    securityGroupIds: List[String],
    ipAddressType: software.amazon.awscdk.cxapi.LoadBalancerIpAddressType,
    loadBalancerCanonicalHostedZoneId: String
  ): software.amazon.awscdk.cxapi.LoadBalancerContextResponse =
    (new software.amazon.awscdk.cxapi.LoadBalancerContextResponse.Builder)
      .loadBalancerDnsName(loadBalancerDnsName)
      .loadBalancerArn(loadBalancerArn)
      .vpcId(vpcId)
      .securityGroupIds(securityGroupIds.asJava)
      .ipAddressType(ipAddressType)
      .loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
      .build()
}
