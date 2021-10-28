package io.burkard.cdk.cxapi

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoadBalancerListenerContextResponse {

  def apply(
    listenerArn: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    listenerPort: Option[Number] = None
  ): software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse =
    (new software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse.Builder)
      .listenerArn(listenerArn.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .listenerPort(listenerPort.orNull)
      .build()
}
