package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInputProps {

  def apply(
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    inputSecurityGroups: Option[List[String]] = None,
    mediaConnectFlows: Option[List[_]] = None,
    vpc: Option[software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty] = None,
    `type`: Option[String] = None,
    sources: Option[List[_]] = None,
    destinations: Option[List[_]] = None,
    roleArn: Option[String] = None,
    inputDevices: Option[List[_]] = None
  ): software.amazon.awscdk.services.medialive.CfnInputProps =
    (new software.amazon.awscdk.services.medialive.CfnInputProps.Builder)
      .name(name.orNull)
      .tags(tags.orNull)
      .inputSecurityGroups(inputSecurityGroups.map(_.asJava).orNull)
      .mediaConnectFlows(mediaConnectFlows.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .`type`(`type`.orNull)
      .sources(sources.map(_.asJava).orNull)
      .destinations(destinations.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .inputDevices(inputDevices.map(_.asJava).orNull)
      .build()
}
