package io.burkard.cdk.services.iotwireless

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDestinationProps {

  def apply(
    name: String,
    expressionType: String,
    expression: String,
    roleArn: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.iotwireless.CfnDestinationProps =
    (new software.amazon.awscdk.services.iotwireless.CfnDestinationProps.Builder)
      .name(name)
      .expressionType(expressionType)
      .expression(expression)
      .roleArn(roleArn)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
