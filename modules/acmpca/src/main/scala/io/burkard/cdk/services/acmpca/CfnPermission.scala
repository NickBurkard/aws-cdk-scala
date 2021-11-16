package io.burkard.cdk.services.acmpca

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPermission {

  def apply(
    internalResourceId: String,
    certificateAuthorityArn: String,
    principal: String,
    actions: List[String],
    sourceAccount: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.acmpca.CfnPermission =
    software.amazon.awscdk.services.acmpca.CfnPermission.Builder
      .create(stackCtx, internalResourceId)
      .certificateAuthorityArn(certificateAuthorityArn)
      .principal(principal)
      .actions(actions.asJava)
      .sourceAccount(sourceAccount.orNull)
      .build()
}
