package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RemoteAccessProperty {

  def apply(
    ec2SshKey: Option[String] = None,
    sourceSecurityGroups: Option[List[String]] = None
  ): software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty =
    (new software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty.Builder)
      .ec2SshKey(ec2SshKey.orNull)
      .sourceSecurityGroups(sourceSecurityGroups.map(_.asJava).orNull)
      .build()
}
