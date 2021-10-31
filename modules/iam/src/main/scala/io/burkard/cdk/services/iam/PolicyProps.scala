package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PolicyProps {

  def apply(
    force: Option[Boolean] = None,
    document: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None,
    users: Option[List[_ <: software.amazon.awscdk.services.iam.IUser]] = None,
    roles: Option[List[_ <: software.amazon.awscdk.services.iam.IRole]] = None,
    statements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    groups: Option[List[_ <: software.amazon.awscdk.services.iam.IGroup]] = None,
    policyName: Option[String] = None
  ): software.amazon.awscdk.services.iam.PolicyProps =
    (new software.amazon.awscdk.services.iam.PolicyProps.Builder)
      .force(force.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .document(document.orNull)
      .users(users.map(_.asJava).orNull)
      .roles(roles.map(_.asJava).orNull)
      .statements(statements.map(_.asJava).orNull)
      .groups(groups.map(_.asJava).orNull)
      .policyName(policyName.orNull)
      .build()
}
