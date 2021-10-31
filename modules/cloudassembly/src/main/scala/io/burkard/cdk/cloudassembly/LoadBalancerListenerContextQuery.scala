package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoadBalancerListenerContextQuery {

  def apply(
    loadBalancerArn: Option[String] = None,
    listenerArn: Option[String] = None,
    loadBalancerType: Option[software.amazon.awscdk.cloudassembly.schema.LoadBalancerType] = None,
    listenerProtocol: Option[software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol] = None,
    region: Option[String] = None,
    account: Option[String] = None,
    lookupRoleArn: Option[String] = None,
    listenerPort: Option[Number] = None,
    loadBalancerTags: Option[List[_ <: software.amazon.awscdk.cloudassembly.schema.Tag]] = None
  ): software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery.Builder)
      .loadBalancerArn(loadBalancerArn.orNull)
      .listenerArn(listenerArn.orNull)
      .loadBalancerType(loadBalancerType.orNull)
      .listenerProtocol(listenerProtocol.orNull)
      .region(region.orNull)
      .account(account.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .listenerPort(listenerPort.orNull)
      .loadBalancerTags(loadBalancerTags.map(_.asJava).orNull)
      .build()
}
