package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPolicy {

  def apply(
    internalResourceId: String,
    policyName: String,
    policyDocument: AnyRef,
    users: Option[List[String]] = None,
    groups: Option[List[String]] = None,
    roles: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnPolicy =
    software.amazon.awscdk.services.iam.CfnPolicy.Builder
      .create(stackCtx, internalResourceId)
      .policyName(policyName)
      .policyDocument(policyDocument)
      .users(users.map(_.asJava).orNull)
      .groups(groups.map(_.asJava).orNull)
      .roles(roles.map(_.asJava).orNull)
      .build()
}
