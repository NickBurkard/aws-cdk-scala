package io.burkard.cdk.services.cassandra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnKeyspaceProps {

  def apply(
    keyspaceName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.cassandra.CfnKeyspaceProps =
    (new software.amazon.awscdk.services.cassandra.CfnKeyspaceProps.Builder)
      .keyspaceName(keyspaceName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
