package io.burkard.cdk.services.networkmanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGlobalNetwork {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkmanager.CfnGlobalNetwork =
    software.amazon.awscdk.services.networkmanager.CfnGlobalNetwork.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
