package io.burkard.cdk.services.sso

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstanceAccessControlAttributeConfigurationProps {

  def apply(
    instanceArn: String,
    accessControlAttributes: Option[List[_]] = None
  ): software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps =
    (new software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps.Builder)
      .instanceArn(instanceArn)
      .accessControlAttributes(accessControlAttributes.map(_.asJava).orNull)
      .build()
}
