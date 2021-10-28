package io.burkard.cdk.services.sso

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInstanceAccessControlAttributeConfigurationProps {

  def apply(
    accessControlAttributes: Option[List[_]] = None,
    instanceArn: Option[String] = None
  ): software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps =
    (new software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps.Builder)
      .accessControlAttributes(accessControlAttributes.map(_.asJava).orNull)
      .instanceArn(instanceArn.orNull)
      .build()
}
