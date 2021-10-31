package io.burkard.cdk.cxapi

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
