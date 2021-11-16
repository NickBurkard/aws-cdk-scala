package io.burkard.cdk.services.codestarconnections

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnection {

  def apply(
    internalResourceId: String,
    connectionName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    hostArn: Option[String] = None,
    providerType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codestarconnections.CfnConnection =
    software.amazon.awscdk.services.codestarconnections.CfnConnection.Builder
      .create(stackCtx, internalResourceId)
      .connectionName(connectionName)
      .tags(tags.map(_.asJava).orNull)
      .hostArn(hostArn.orNull)
      .providerType(providerType.orNull)
      .build()
}
