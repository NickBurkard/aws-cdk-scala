package io.burkard.cdk.services.acmpca

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPermissionProps {

  def apply(
    certificateAuthorityArn: String,
    principal: String,
    actions: List[String],
    sourceAccount: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnPermissionProps =
    (new software.amazon.awscdk.services.acmpca.CfnPermissionProps.Builder)
      .certificateAuthorityArn(certificateAuthorityArn)
      .principal(principal)
      .actions(actions.asJava)
      .sourceAccount(sourceAccount.orNull)
      .build()
}
