package io.burkard.cdk.services.acmpca

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPermission {

  def apply(
    internalResourceId: String,
    sourceAccount: Option[String] = None,
    certificateAuthorityArn: Option[String] = None,
    principal: Option[String] = None,
    actions: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.acmpca.CfnPermission =
    software.amazon.awscdk.services.acmpca.CfnPermission.Builder
      .create(stackCtx, internalResourceId)
      .sourceAccount(sourceAccount.orNull)
      .certificateAuthorityArn(certificateAuthorityArn.orNull)
      .principal(principal.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
