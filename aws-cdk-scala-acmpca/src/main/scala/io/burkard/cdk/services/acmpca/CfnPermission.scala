package io.burkard.cdk.services.acmpca

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
