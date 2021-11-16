package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfigureNatOptions {

  def apply(
    natSubnets: List[_ <: software.amazon.awscdk.services.ec2.PublicSubnet],
    privateSubnets: List[_ <: software.amazon.awscdk.services.ec2.PrivateSubnet],
    vpc: software.amazon.awscdk.services.ec2.Vpc
  ): software.amazon.awscdk.services.ec2.ConfigureNatOptions =
    (new software.amazon.awscdk.services.ec2.ConfigureNatOptions.Builder)
      .natSubnets(natSubnets.asJava)
      .privateSubnets(privateSubnets.asJava)
      .vpc(vpc)
      .build()
}
