package io.burkard.cdk.services.sso

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstanceAccessControlAttributeConfiguration {

  def apply(
    internalResourceId: String,
    accessControlAttributes: Option[List[_]] = None,
    instanceArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration =
    software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .accessControlAttributes(accessControlAttributes.map(_.asJava).orNull)
      .instanceArn(instanceArn.orNull)
      .build()
}
