package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGroupProps {

  def apply(
    path: Option[String] = None,
    groupName: Option[String] = None,
    managedPolicyArns: Option[List[String]] = None,
    policies: Option[List[_]] = None
  ): software.amazon.awscdk.services.iam.CfnGroupProps =
    (new software.amazon.awscdk.services.iam.CfnGroupProps.Builder)
      .path(path.orNull)
      .groupName(groupName.orNull)
      .managedPolicyArns(managedPolicyArns.map(_.asJava).orNull)
      .policies(policies.map(_.asJava).orNull)
      .build()
}
