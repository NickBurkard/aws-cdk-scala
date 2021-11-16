package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancerListenerContextQuery {

  def apply(
    region: String,
    account: String,
    loadBalancerArn: Option[String] = None,
    listenerArn: Option[String] = None,
    loadBalancerType: Option[software.amazon.awscdk.cloudassembly.schema.LoadBalancerType] = None,
    listenerProtocol: Option[software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol] = None,
    lookupRoleArn: Option[String] = None,
    listenerPort: Option[Number] = None,
    loadBalancerTags: Option[List[_ <: software.amazon.awscdk.cloudassembly.schema.Tag]] = None
  ): software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery.Builder)
      .region(region)
      .account(account)
      .loadBalancerArn(loadBalancerArn.orNull)
      .listenerArn(listenerArn.orNull)
      .loadBalancerType(loadBalancerType.orNull)
      .listenerProtocol(listenerProtocol.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .listenerPort(listenerPort.orNull)
      .loadBalancerTags(loadBalancerTags.map(_.asJava).orNull)
      .build()
}
