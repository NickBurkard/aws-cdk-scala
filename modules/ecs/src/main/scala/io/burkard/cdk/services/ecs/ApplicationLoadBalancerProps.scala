package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationLoadBalancerProps {

  def apply(
    name: Option[String] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps]] = None,
    publicLoadBalancer: Option[Boolean] = None,
    domainZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None,
    domainName: Option[String] = None
  ): software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps =
    (new software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps.Builder)
      .name(name.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .publicLoadBalancer(publicLoadBalancer.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .domainZone(domainZone.orNull)
      .domainName(domainName.orNull)
      .build()
}
