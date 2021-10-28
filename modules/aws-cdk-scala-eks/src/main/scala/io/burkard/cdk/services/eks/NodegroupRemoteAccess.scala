package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NodegroupRemoteAccess {

  def apply(
    sshKeyName: Option[String] = None,
    sourceSecurityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None
  ): software.amazon.awscdk.services.eks.NodegroupRemoteAccess =
    (new software.amazon.awscdk.services.eks.NodegroupRemoteAccess.Builder)
      .sshKeyName(sshKeyName.orNull)
      .sourceSecurityGroups(sourceSecurityGroups.map(_.asJava).orNull)
      .build()
}
