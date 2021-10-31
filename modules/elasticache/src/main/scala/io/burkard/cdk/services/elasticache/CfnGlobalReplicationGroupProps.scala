package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGlobalReplicationGroupProps {

  def apply(
    cacheParameterGroupName: Option[String] = None,
    globalReplicationGroupDescription: Option[String] = None,
    automaticFailoverEnabled: Option[Boolean] = None,
    globalReplicationGroupIdSuffix: Option[String] = None,
    regionalConfigurations: Option[List[_]] = None,
    globalNodeGroupCount: Option[Number] = None,
    members: Option[List[_]] = None,
    cacheNodeType: Option[String] = None,
    engineVersion: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps =
    (new software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps.Builder)
      .cacheParameterGroupName(cacheParameterGroupName.orNull)
      .globalReplicationGroupDescription(globalReplicationGroupDescription.orNull)
      .automaticFailoverEnabled(automaticFailoverEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix.orNull)
      .regionalConfigurations(regionalConfigurations.map(_.asJava).orNull)
      .globalNodeGroupCount(globalNodeGroupCount.orNull)
      .members(members.map(_.asJava).orNull)
      .cacheNodeType(cacheNodeType.orNull)
      .engineVersion(engineVersion.orNull)
      .build()
}
