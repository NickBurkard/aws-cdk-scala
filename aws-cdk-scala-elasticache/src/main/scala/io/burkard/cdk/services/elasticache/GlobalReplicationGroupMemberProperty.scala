package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GlobalReplicationGroupMemberProperty {

  def apply(
    replicationGroupRegion: Option[String] = None,
    role: Option[String] = None,
    replicationGroupId: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty =
    (new software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.Builder)
      .replicationGroupRegion(replicationGroupRegion.orNull)
      .role(role.orNull)
      .replicationGroupId(replicationGroupId.orNull)
      .build()
}
