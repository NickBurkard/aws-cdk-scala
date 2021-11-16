package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPC {

  def apply(
    internalResourceId: String,
    cidrBlock: String,
    enableDnsSupport: Option[Boolean] = None,
    instanceTenancy: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enableDnsHostnames: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPC =
    software.amazon.awscdk.services.ec2.CfnVPC.Builder
      .create(stackCtx, internalResourceId)
      .cidrBlock(cidrBlock)
      .enableDnsSupport(enableDnsSupport.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceTenancy(instanceTenancy.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enableDnsHostnames(enableDnsHostnames.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
