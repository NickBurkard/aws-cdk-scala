package io.burkard.cdk.services.iotwireless

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDestination {

  def apply(
    internalResourceId: String,
    name: String,
    expressionType: String,
    expression: String,
    roleArn: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotwireless.CfnDestination =
    software.amazon.awscdk.services.iotwireless.CfnDestination.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .expressionType(expressionType)
      .expression(expression)
      .roleArn(roleArn)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
