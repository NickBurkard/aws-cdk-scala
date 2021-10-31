package io.burkard.cdk.services.acmpca

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPermissionProps {

  def apply(
    sourceAccount: Option[String] = None,
    certificateAuthorityArn: Option[String] = None,
    principal: Option[String] = None,
    actions: Option[List[String]] = None
  ): software.amazon.awscdk.services.acmpca.CfnPermissionProps =
    (new software.amazon.awscdk.services.acmpca.CfnPermissionProps.Builder)
      .sourceAccount(sourceAccount.orNull)
      .certificateAuthorityArn(certificateAuthorityArn.orNull)
      .principal(principal.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
