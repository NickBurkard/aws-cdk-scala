package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPolicy {

  def apply(
    internalResourceId: String,
    users: Option[List[String]] = None,
    groups: Option[List[String]] = None,
    policyName: Option[String] = None,
    policyDocument: Option[AnyRef] = None,
    roles: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnPolicy =
    software.amazon.awscdk.services.iam.CfnPolicy.Builder
      .create(stackCtx, internalResourceId)
      .users(users.map(_.asJava).orNull)
      .groups(groups.map(_.asJava).orNull)
      .policyName(policyName.orNull)
      .policyDocument(policyDocument.orNull)
      .roles(roles.map(_.asJava).orNull)
      .build()
}
