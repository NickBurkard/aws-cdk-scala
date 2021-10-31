package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
