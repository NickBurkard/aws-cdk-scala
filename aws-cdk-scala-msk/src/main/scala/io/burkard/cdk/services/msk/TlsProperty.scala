package io.burkard.cdk.services.msk

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
