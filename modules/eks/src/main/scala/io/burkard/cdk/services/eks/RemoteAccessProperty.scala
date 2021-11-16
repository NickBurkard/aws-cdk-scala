package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RemoteAccessProperty {

  def apply(
    ec2SshKey: String,
    sourceSecurityGroups: Option[List[String]] = None
  ): software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty =
    (new software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty.Builder)
      .ec2SshKey(ec2SshKey)
      .sourceSecurityGroups(sourceSecurityGroups.map(_.asJava).orNull)
      .build()
}
