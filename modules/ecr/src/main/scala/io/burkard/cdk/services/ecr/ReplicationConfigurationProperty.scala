package io.burkard.cdk.services.ecr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicationConfigurationProperty {

  def apply(
    rules: Option[List[_]] = None
  ): software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty =
    (new software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty.Builder)
      .rules(rules.map(_.asJava).orNull)
      .build()
}
