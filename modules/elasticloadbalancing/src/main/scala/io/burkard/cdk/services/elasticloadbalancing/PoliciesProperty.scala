package io.burkard.cdk.services.elasticloadbalancing

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PoliciesProperty {

  def apply(
    policyName: String,
    attributes: List[_],
    policyType: String,
    loadBalancerPorts: Option[List[String]] = None,
    instancePorts: Option[List[String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.Builder)
      .policyName(policyName)
      .attributes(attributes.asJava)
      .policyType(policyType)
      .loadBalancerPorts(loadBalancerPorts.map(_.asJava).orNull)
      .instancePorts(instancePorts.map(_.asJava).orNull)
      .build()
}
