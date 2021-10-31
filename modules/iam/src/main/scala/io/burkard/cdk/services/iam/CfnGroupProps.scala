package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
