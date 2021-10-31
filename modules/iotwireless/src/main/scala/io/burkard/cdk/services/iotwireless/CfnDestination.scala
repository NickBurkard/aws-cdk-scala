package io.burkard.cdk.services.iotwireless

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDestination {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    expressionType: Option[String] = None,
    expression: Option[String] = None,
    roleArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotwireless.CfnDestination =
    software.amazon.awscdk.services.iotwireless.CfnDestination.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .expressionType(expressionType.orNull)
      .expression(expression.orNull)
      .roleArn(roleArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
