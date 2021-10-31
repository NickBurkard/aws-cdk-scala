package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkLoadBalancerProps {

  def apply(
    name: Option[String] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps]] = None,
    publicLoadBalancer: Option[Boolean] = None,
    domainZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None,
    domainName: Option[String] = None
  ): software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps =
    (new software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps.Builder)
      .name(name.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .publicLoadBalancer(publicLoadBalancer.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .domainZone(domainZone.orNull)
      .domainName(domainName.orNull)
      .build()
}
