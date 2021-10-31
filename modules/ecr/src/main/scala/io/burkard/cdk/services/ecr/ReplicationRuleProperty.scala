package io.burkard.cdk.services.ecr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
