package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfigureNatOptions {

  def apply(
    natSubnets: Option[List[_ <: software.amazon.awscdk.services.ec2.PublicSubnet]] = None,
    privateSubnets: Option[List[_ <: software.amazon.awscdk.services.ec2.PrivateSubnet]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.Vpc] = None
  ): software.amazon.awscdk.services.ec2.ConfigureNatOptions =
    (new software.amazon.awscdk.services.ec2.ConfigureNatOptions.Builder)
      .natSubnets(natSubnets.map(_.asJava).orNull)
      .privateSubnets(privateSubnets.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .build()
}
