package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConnectionsListProperty {

  def apply(
    connections: Option[List[String]] = None
  ): software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty =
    (new software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty.Builder)
      .connections(connections.map(_.asJava).orNull)
      .build()
}
