package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClassicLoadBalancersConfigProperty {

  def apply(
    classicLoadBalancers: List[_]
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty.Builder)
      .classicLoadBalancers(classicLoadBalancers.asJava)
      .build()
}
