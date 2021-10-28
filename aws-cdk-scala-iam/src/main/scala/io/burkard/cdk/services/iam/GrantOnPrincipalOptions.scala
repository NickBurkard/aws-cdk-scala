package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
