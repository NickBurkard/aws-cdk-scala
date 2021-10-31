package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPCProps {

  def apply(
    enableDnsSupport: Option[Boolean] = None,
    instanceTenancy: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enableDnsHostnames: Option[Boolean] = None,
    cidrBlock: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnVPCProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCProps.Builder)
      .enableDnsSupport(enableDnsSupport.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceTenancy(instanceTenancy.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enableDnsHostnames(enableDnsHostnames.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cidrBlock(cidrBlock.orNull)
      .build()
}
