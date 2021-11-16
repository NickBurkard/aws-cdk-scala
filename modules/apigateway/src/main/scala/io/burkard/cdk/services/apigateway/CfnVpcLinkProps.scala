package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVpcLinkProps {

  def apply(
    name: String,
    targetArns: List[String],
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.apigateway.CfnVpcLinkProps =
    (new software.amazon.awscdk.services.apigateway.CfnVpcLinkProps.Builder)
      .name(name)
      .targetArns(targetArns.asJava)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
