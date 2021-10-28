package io.burkard.cdk.services.networkmanager

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
