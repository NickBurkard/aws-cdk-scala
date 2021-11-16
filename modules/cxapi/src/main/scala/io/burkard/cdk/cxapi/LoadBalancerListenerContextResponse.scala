package io.burkard.cdk.cxapi

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancerListenerContextResponse {

  def apply(
    listenerArn: String,
    securityGroupIds: List[String],
    listenerPort: Number
  ): software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse =
    (new software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse.Builder)
      .listenerArn(listenerArn)
      .securityGroupIds(securityGroupIds.asJava)
      .listenerPort(listenerPort)
      .build()
}
