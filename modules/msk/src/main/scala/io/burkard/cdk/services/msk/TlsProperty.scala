package io.burkard.cdk.services.msk

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TlsProperty {

  def apply(
    certificateAuthorityArnList: Option[List[String]] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.TlsProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.TlsProperty.Builder)
      .certificateAuthorityArnList(certificateAuthorityArnList.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
