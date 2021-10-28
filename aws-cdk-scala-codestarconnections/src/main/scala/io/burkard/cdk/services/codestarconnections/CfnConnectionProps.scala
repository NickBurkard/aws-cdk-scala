package io.burkard.cdk.services.codestarconnections

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConnectionProps {

  def apply(
    connectionName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    hostArn: Option[String] = None,
    providerType: Option[String] = None
  ): software.amazon.awscdk.services.codestarconnections.CfnConnectionProps =
    (new software.amazon.awscdk.services.codestarconnections.CfnConnectionProps.Builder)
      .connectionName(connectionName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .hostArn(hostArn.orNull)
      .providerType(providerType.orNull)
      .build()
}
