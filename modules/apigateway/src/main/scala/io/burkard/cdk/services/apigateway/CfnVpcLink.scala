package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVpcLink {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    description: Option[String] = None,
    targetArns: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnVpcLink =
    software.amazon.awscdk.services.apigateway.CfnVpcLink.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .description(description.orNull)
      .targetArns(targetArns.map(_.asJava).orNull)
      .build()
}
