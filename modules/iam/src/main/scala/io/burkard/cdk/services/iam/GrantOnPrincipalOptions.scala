package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrantOnPrincipalOptions {

  def apply(
    scope: Option[software.constructs.IConstruct] = None,
    resourceArns: Option[List[String]] = None,
    grantee: Option[software.amazon.awscdk.services.iam.IGrantable] = None,
    actions: Option[List[String]] = None
  ): software.amazon.awscdk.services.iam.GrantOnPrincipalOptions =
    (new software.amazon.awscdk.services.iam.GrantOnPrincipalOptions.Builder)
      .scope(scope.orNull)
      .resourceArns(resourceArns.map(_.asJava).orNull)
      .grantee(grantee.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
