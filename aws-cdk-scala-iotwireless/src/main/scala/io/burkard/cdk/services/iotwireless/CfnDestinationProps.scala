package io.burkard.cdk.services.iotwireless

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDestinationProps {

  def apply(
    name: Option[String] = None,
    expressionType: Option[String] = None,
    expression: Option[String] = None,
    roleArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.iotwireless.CfnDestinationProps =
    (new software.amazon.awscdk.services.iotwireless.CfnDestinationProps.Builder)
      .name(name.orNull)
      .expressionType(expressionType.orNull)
      .expression(expression.orNull)
      .roleArn(roleArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
