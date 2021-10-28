package io.burkard.cdk.services.ecr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplicationRuleProperty {

  def apply(
    repositoryFilters: Option[List[_]] = None,
    destinations: Option[List[_]] = None
  ): software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty =
    (new software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty.Builder)
      .repositoryFilters(repositoryFilters.map(_.asJava).orNull)
      .destinations(destinations.map(_.asJava).orNull)
      .build()
}
