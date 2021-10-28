package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClassicLoadBalancersConfigProperty {

  def apply(
    classicLoadBalancers: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty.Builder)
      .classicLoadBalancers(classicLoadBalancers.map(_.asJava).orNull)
      .build()
}