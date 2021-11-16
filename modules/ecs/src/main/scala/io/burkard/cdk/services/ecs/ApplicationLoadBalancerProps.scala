package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationLoadBalancerProps {

  def apply(
    name: String,
    listeners: List[_ <: software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps],
    publicLoadBalancer: Option[Boolean] = None,
    domainZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None,
    domainName: Option[String] = None
  ): software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps =
    (new software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps.Builder)
      .name(name)
      .listeners(listeners.asJava)
      .publicLoadBalancer(publicLoadBalancer.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .domainZone(domainZone.orNull)
      .domainName(domainName.orNull)
      .build()
}
