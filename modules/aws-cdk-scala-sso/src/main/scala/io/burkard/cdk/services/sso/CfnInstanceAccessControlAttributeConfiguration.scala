package io.burkard.cdk.services.sso

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
