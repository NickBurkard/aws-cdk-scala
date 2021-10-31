package io.burkard.cdk.services.sso

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessControlAttributeValueProperty {

  def apply(
    source: Option[List[String]] = None
  ): software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty =
    (new software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty.Builder)
      .source(source.map(_.asJava).orNull)
      .build()
}
